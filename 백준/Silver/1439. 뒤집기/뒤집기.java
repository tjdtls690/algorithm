import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();
    
    void run () throws IOException {
        String input = br.readLine();
        int[] answer = new int[2];
        
        char before = ' ';
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (before != ch) {
                answer[ch - '0']++;
            }
            
            before = ch;
        }
        
        sb.append(Math.min(answer[0], answer[1]));
        bw.write(sb.toString());
        bw.close();
        br.close();
    }
    
    public static void main(String[] args) throws IOException {
        Main m = new Main();
        m.run();
    }
}