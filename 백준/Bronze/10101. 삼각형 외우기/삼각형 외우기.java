import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();
    
    void run () throws IOException {
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        
        if (a + b + c != 180) {
            sb.append("Error");
        } else if (a == 60 && b == 60) {
            sb.append("Equilateral");
        } else if (a != b && b != c && a != c) {
            sb.append("Scalene");
        } else {
            sb.append("Isosceles");
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