import java.util.*;

public class Solution {
    public int solution(int n) {
        String[] nums = String.valueOf(n).split("");
        int answer = 0;
        for (String s : nums) {
            answer += Integer.parseInt(s);
        }
        return answer;
    }
}