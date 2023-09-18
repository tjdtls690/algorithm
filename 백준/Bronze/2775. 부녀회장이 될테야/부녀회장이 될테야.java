import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();
    
    void run () throws IOException {
        int t = Integer.parseInt(br.readLine());
        int[][] map = new int[15][14];
        for (int i = 0; i < 14; i++) {
            map[0][i] = i + 1;
            map[i][0] = 1;
        }
        map[14][0] = 1;
        
        for (int i = 1; i < 15; i++) {
            for (int j = 1; j < 14; j++) {
                map[i][j] = map[i-1][j] + map[i][j-1];
            }
        }
        
        for (int i = 0; i < t; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            
            sb.append(map[k][n-1]).append("\n");
        }
        
        bw.write(sb.toString());
        bw.close();
        br.close();
    }
    
    public static void main(String[] args) throws IOException {
        Main m = new Main();
        m.run();
    }
}