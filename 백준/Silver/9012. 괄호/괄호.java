import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();
    
    void run () throws IOException {
        int n = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            boolean flag = false;
            String input = br.readLine();
            
            for (int j = 0; j < input.length(); j++) {
                char ch = input.charAt(j);
                if (ch == '(') {
                    cnt++;
                } else {
                    if (cnt == 0) {
                        flag = true;
                        break;
                    } else {
                        cnt--;
                    }
                }
            }
            
            if (flag || cnt != 0) {
                sb.append("NO");
            } else {
                sb.append("YES");
            }
            sb.append("\n");
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