import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();
    
    void run () throws IOException {
        String[] inputs = br.readLine().split(" ");
        int k = Integer.parseInt(inputs[0]);
        int l = Integer.parseInt(inputs[1]);
        int n = Integer.parseInt(inputs[2]);
        String str = br.readLine();
        
        int kcnt = 0;
        int lcnt = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '1') {
                kcnt++;
            } else if (kcnt < k) {
                kcnt = 0;
            }

            if (kcnt >= k) {
                if (ch == '1') {
                    lcnt = 0;
                } else {
                    lcnt++;
                }

                if (lcnt >= l) {
                    sb.append(String.valueOf(i + 1)).append("\n");
                    kcnt = 0;
                    lcnt = 0;
                }
            }
        }

        if (kcnt >= k) {
            sb.append(String.valueOf(str.length() + l - lcnt));
        }
        
        if (sb.length() == 0) {
            sb.append("NIKAD");
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