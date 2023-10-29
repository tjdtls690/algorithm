import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();
    
    void run () throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] bs = new int[n];
        for (int i = 0; i < bs.length; i++) {
            bs[i] = i + 1;
        }
        
        while(m-- > 0) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            
            int tmp = bs[i - 1];
            bs[i - 1] = bs[j - 1];
            bs[j - 1] = tmp;
        }
        
        for (int i : bs) {
            sb.append(i).append(" ");
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