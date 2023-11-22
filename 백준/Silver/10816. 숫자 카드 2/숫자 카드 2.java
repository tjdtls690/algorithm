import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();
    
    void run () throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
        int m = Integer.parseInt(br.readLine());
        int[] targets = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        
        for (int target : targets) {
            int startIdx = -1;
            int endIdx = input.length;
            
            int resultStartIdx = getStartIdx(input, startIdx, endIdx, 0, target);
            if (resultStartIdx == -1) {
                sb.append(0).append(" ");
                continue;
            }
            int resultEndIdx = getEndIdx(input, startIdx, endIdx, 0, target);
            sb.append(resultEndIdx - resultStartIdx + 1).append(" ");
        }
        
        bw.write(sb.toString());
        bw.close();
        br.close();
    }
    
    private int getStartIdx(
        int[] input,
        int startIdx,
        int endIdx,
        int midIdx,
        int target
    ) {
        while(true) {
            midIdx = (startIdx + endIdx) / 2;
            int current = input[midIdx];
            if (startIdx + 1 >= endIdx) {
                return -1;
            } else if (current == target) {
                if (midIdx == 0 || input[midIdx - 1] < target) {
                    return midIdx;
                } else {
                    endIdx = midIdx;
                }
            } else if (current < target) {
                startIdx = midIdx;
            } else {
                endIdx = midIdx;
            }
        }
    }
    
    private int getEndIdx(
        int[] input,
        int startIdx,
        int endIdx,
        int midIdx,
        int target
    ) {
        while(true) {
            midIdx = (startIdx + endIdx) / 2;
            int current = input[midIdx];
            if (current == target) {
                if (midIdx == input.length - 1 || input[midIdx + 1] > target) {
                    return midIdx;
                } else {
                    startIdx = midIdx;
                }
            } else if (current < target) {
                startIdx = midIdx;
            } else {
                endIdx = midIdx;
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
        Main m = new Main();
        m.run();
    }
}