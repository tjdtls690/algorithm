import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();

    void run () throws IOException {
        char[][] map = new char[10][10];
        for (int i = 0; i < 10; i++) {
            String input = br.readLine();
            for (int j = 0; j < 10; j++) {
                char t = input.charAt(j);
                map[i][j] = t;
            }
        }

        Loop1 : for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                char current = map[i][j];
                if (current == '.') {
                    map[i][j] = 'X';
                    if (check(map)) {
                        sb.append(1);
                        break Loop1;
                    }
                    map[i][j] = '.';
                }
            }
        }

        if (sb.length() == 0) {
            sb.append(0);
        }
        bw.write(sb.toString());
        bw.close();
        br.close();
    }

    private boolean check(final char[][] map) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                char current = map[i][j];
                if (current == 'X') {
                    if (maxCount(map, i, j) == 4) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private int maxCount(final char[][] map, final int i, final int j) {
        int[] dx = {0, 1, 1, 1};
        int[] dy = {1, 1, 0, -1};
        int mxCnt = 0;

        for (int k = 0; k < 4; k++) {
            int cnt = 0;
            int x = i;
            int y = j;
            for (int m = 0; m < 4; m++) {
                x += dx[k];
                y += dy[k];
                if (x >= 10 || y >= 10 || y < 0) {
                    break;
                }

                char current = map[x][y];
                if (current == 'X') {
                    cnt++;
                }
                if (mxCnt < cnt) {
                    mxCnt = cnt;
                }
            }
        }
        return mxCnt;
    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        m.run();
    }
}