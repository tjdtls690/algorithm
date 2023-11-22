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
        
        convertForResult(0, 0, n, false);
        
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
        int x,
        int y,
        int n,
        boolean isSpace
    ) {
        if (isSpace) {
            for (int i = x; i < x + n; i++) {
                for (int j = y; j < y + n; j++) {
                    map[i][j] = ' ';
                }
            }
            return;
        }
        
        if (n == 1) {
            map[x][y] = '*';
            return;
        }
        
        int cnt = 0;
        for (int i = x; i < x+n; i += n/3) {
            for (int j = y; j < y+n; j += n/3) {
                cnt++;
                convertForResult(i, j, n/3, cnt == 5);
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
        Main m = new Main();
        m.run();
    }
}