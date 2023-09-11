import java.util.stream.*;

class Solution {
    public int solution(int[] a, int[] b) {
        return IntStream.range(0, a.length)
            .map(idx -> a[idx] * b[idx])
            .sum();
    }
}