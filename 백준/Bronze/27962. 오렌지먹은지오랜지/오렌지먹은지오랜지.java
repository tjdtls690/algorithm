import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();
    
    void run () throws IOException {
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int cnt = 0;
        
        for (int i = 0; i < n; i++) {
            final char[] f = str.substring(0, i + 1).toCharArray();
            final char[] e = str.substring(str.length() - i - 1).toCharArray();

            for (int j = 0; j < f.length; j++) {
                if (f[j] != e[j]) {
                    cnt++;
                }

                if (cnt > 1) {
                    break;
                }
            }

            if (cnt == 1) {
                break;
            }
            cnt = 0;
        }

        
        sb.append(cnt == 1 ? "YES" : "NO");
        
        bw.write(sb.toString());
        bw.close();
        br.close();
    }
    
    public static void main(String[] args) throws IOException {
        Main m = new Main();
        m.run();
    }
}