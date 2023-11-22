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
            for (int j = 0; j < n; j++) {
                map[i][j] = '*';
            }
        }
        
        convertForResult(0, 0, n, n);
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(map[i][j]);
            }
            sb.append('\n');
        }
        bw.write(sb.toString());
        bw.close();
        br.close();
    }
    
    private void convertForResult(
        int xStart,
        int yStart,
        int xEnd,
        int yEnd
    ) {
        int thirdDivide = (xEnd - xStart) / 3;
        
        int xConvertStart = xStart + thirdDivide;
        int xConvertEnd = xConvertStart + thirdDivide;
        int yConvertStart = yStart + thirdDivide;
        int yConvertEnd = yConvertStart + thirdDivide;
        
        for (int i = xConvertStart; i < xConvertEnd; i++) {
            for (int j = yConvertStart; j < yConvertEnd; j++) {
                map[i][j] = ' ';
            }
        }
        
        if (thirdDivide <= 1) {
            return;
        }
        
        int[] nextX = {xStart, xConvertStart, xConvertEnd, xConvertEnd + thirdDivide};
        int[] nextY = {yStart, yConvertStart, yConvertEnd, yConvertEnd + thirdDivide};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                convertForResult(nextX[i], nextY[j], nextX[i + 1], nextY[j + 1]);
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
        Main m = new Main();
        m.run();
    }
}