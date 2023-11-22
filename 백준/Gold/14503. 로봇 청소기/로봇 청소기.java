import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();
    int[][] map;
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};
    int rx;
    int ry;
    int rd;
    
    void run () throws IOException {
        String[] coor = br.readLine().split(" ");
        int n = Integer.parseInt(coor[0]);
        int m = Integer.parseInt(coor[1]);
        
        String[] rCoor = br.readLine().split(" ");
        rx = Integer.parseInt(rCoor[0]);
        ry = Integer.parseInt(rCoor[1]);
        rd = Integer.parseInt(rCoor[2]);
        
        map = new int[n][m];
        for (int i = 0; i < map.length; i++) {
            String[] inMap = br.readLine().split(" ");
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = Integer.parseInt(inMap[j]);
            }
        }
        
        int cnt = 0;
        while(true) {
            if (map[rx][ry] == 0) {
                map[rx][ry] = 2;
                cnt++;
            }
            
            if (!isExistEmpty()) {
                int back = (rd + 2) % 4;
                int backx = rx + dx[back];
                int backy = ry + dy[back];
                if (map[backx][backy] == 1) {
                    break;
                } else {
                    rx = backx;
                    ry = backy;
                }
            } else {
                rd--;
                if (rd < 0) {
                    rd = 3;
                }
                
                if (map[rx + dx[rd]][ry + dy[rd]] == 0) {
                    rx += dx[rd];
                    ry += dy[rd];
                }
            }
        }
        
        sb.append(cnt);
        bw.write(sb.toString());
        bw.close();
        br.close();
    }
    
    private boolean isExistEmpty() {
        for (int i = 0; i < 4; i++) {
            if (map[rx + dx[i]][ry + dy[i]] == 0) {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) throws IOException {
        Main m = new Main();
        m.run();
    }
}