import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();
    
    void run () throws IOException {
        String input = br.readLine();
        int cnt = 0;
        int increaseCnt = 0;
        
        Deque<Character> dq = new ArrayDeque<>();
        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if (current == '(') {
                increaseCnt++;
            } else {
                if (dq.peekLast() == '(') {
                    increaseCnt--;
                    cnt += increaseCnt;
                } else {
                    increaseCnt--;
                    cnt++;
                }
            }
            
            dq.add(current);
        }
        
        sb.append(cnt);
        bw.write(sb.toString());
        bw.close();
        br.close();
    }
    
    public static void main(String[] args) throws IOException {
        Main m = new Main();
        m.run();
    }
}