import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] numbers) {
        List<Integer> li = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        return (int) IntStream.rangeClosed(0, 9)
            .filter(num -> !li.contains(num))
            .sum();
    }
}