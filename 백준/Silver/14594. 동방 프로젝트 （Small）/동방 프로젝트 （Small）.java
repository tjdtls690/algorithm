import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();
    
    void run () throws IOException {
        Set<List<Integer>> actNum = new HashSet<>();
        
        int roomSu = Integer.parseInt(br.readLine());
        int act = Integer.parseInt(br.readLine());
        for (int i = 0; i < act; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            
            for (int j = start; j < end; j++) {
                actNum.add(List.of(j, j + 1));
            }
        }
        
        sb.append(roomSu - actNum.size());
        bw.write(sb.toString());
        bw.close();
        br.close();
    }
    
    public static void main(String[] args) throws IOException {
        Main m = new Main();
        m.run();
    }
}