import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();
    char[][] map;
    
    void run () throws IOException {
        int n = Integer.parseInt(br.readLine());
        map = new char[n][n];
        
        for (int i = 0; i < n; i++) {
            char[] input = br.readLine().toCharArray();
            for (int j = 0; j < n; j++) {
                map[i][j] = input[j];
            }
        }
        
        String result = getResult(0, 0, n - 1, n - 1);
        
        sb.append(result);
        bw.write(sb.toString());
        bw.close();
        br.close();
    }
    
    private String getResult(
        int xStart,
        int yStart,
        int xEnd,
        int yEnd
    ) {
        Set<Character> check = new HashSet<>();
        for (int i = xStart; i <= xEnd; i++) {
            for (int j = yStart; j <= yEnd; j++) {
                check.add(map[i][j]);
            }
        }
        
        if (check.size() == 1) {
            return String.valueOf(map[xStart][yStart]);
        }
        
        int xLessHalf = (xStart + xEnd) / 2;
        int yLessHalf = (yStart + yEnd) / 2;
        int xOverHalf = (xStart + xEnd) / 2 + 1;
        int yOverHalf = (yStart + yEnd) / 2 + 1;
        String northWest = getResult(xStart, yStart, xLessHalf, yLessHalf);
        String northEast = getResult(xStart, yOverHalf, xLessHalf, yEnd);
        String southWest = getResult(xOverHalf, yStart, xEnd, yLessHalf);
        String southEast = getResult(xOverHalf, yOverHalf, xEnd, yEnd);
        
        StringBuilder perResult = new StringBuilder();
        perResult.append("(")
            .append(northWest)
            .append(northEast)
            .append(southWest)
            .append(southEast)
            .append(")");
        
        return perResult.toString();
    }
    
    public static void main(String[] args) throws IOException {
        Main m = new Main();
        m.run();
    }
}