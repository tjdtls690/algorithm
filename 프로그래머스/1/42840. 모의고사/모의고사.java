import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] score = new int[3];
        int[] s1 = {1, 2, 3, 4, 5};
        int[] s2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] s3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        for (int i = 0; i < answers.length; i++) {
            int a = answers[i];
            int a1 = s1[i % s1.length];
            int a2 = s2[i % s2.length];
            int a3 = s3[i % s3.length];
            
            if (a1 == a) {
                score[0]++;
            }
            if (a2 == a) {
                score[1]++;
            }
            if (a3 == a) {
                score[2]++;
            }
        }
        int max = Arrays.stream(score).max().orElse(0);
        
        return IntStream.range(0, 3)
            .filter(idx -> score[idx] == max)
            .map(idx -> idx + 1)
            .toArray();
    }
}