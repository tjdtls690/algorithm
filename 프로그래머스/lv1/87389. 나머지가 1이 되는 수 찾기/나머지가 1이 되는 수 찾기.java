import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int n) {
        return IntStream.range(2, n)
            .filter(num -> n % num == 1)
            .findFirst()
            .orElse(0);
    }
}