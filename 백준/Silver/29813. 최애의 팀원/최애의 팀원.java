import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();
    
    void run () throws IOException {
        int n = Integer.parseInt(br.readLine());
        
        final Deque<String> order = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            order.add(br.readLine());
        }
        
        while (order.size() > 1) {
            final String current = order.pop();
            final String[] split = current.split(" ");
            int num = Integer.parseInt(split[1]);
            
            while(num-->1) {
                order.add(order.pop());
            }
            order.pop();
        }
        
        sb.append(order.pop().split(" ")[0]);
        
        bw.write(sb.toString());
        bw.close();
        br.close();
    }
    
    public static void main(String[] args) throws IOException {
        Main m = new Main();
        m.run();
    }
}