import java.util.stream.*;

class Solution {
    public String solution(int n) {
        return IntStream.range(0, n)
            .mapToObj(num -> num % 2 == 0 ? "수" : "박")
            .collect(Collectors.joining());
    }
}