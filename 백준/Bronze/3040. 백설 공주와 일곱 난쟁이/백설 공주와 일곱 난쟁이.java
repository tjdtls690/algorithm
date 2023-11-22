import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();
    
    void run () throws IOException {
        int[] arr = new int[9];
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }
        
        int remainNum = sum - 100;
        
        Loop1 : for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (i != j && arr[i] + arr[j] == remainNum) {
                    for (int k = 0; k < 9; k++) {
                        if (k != i && k != j) {
                            sb.append(arr[k]).append("\n");
                        }
                    }
                    break Loop1;
                }
            }
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