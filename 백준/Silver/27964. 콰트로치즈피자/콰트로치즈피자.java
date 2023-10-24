import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();
    
    void run () throws IOException {
        br.readLine();
        
        final Set<String> set = new HashSet<>();
        final String[] strs = br.readLine().split(" ");
        for (String str : strs) {
            if (str.endsWith("Cheese")) {
                set.add(str);
            }
        }
        
        sb.append(set.size() >= 4 ? "yummy" : "sad");
        bw.write(sb.toString());
        bw.close();
        br.close();
    }
    
    public static void main(String[] args) throws IOException {
        Main m = new Main();
        m.run();
    }
}