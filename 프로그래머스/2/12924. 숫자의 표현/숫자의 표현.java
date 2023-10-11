import java.util.*;

class Solution {
    public int solution(int n) {
        int cnt = 0;
        int per = 0;
        while (per <= n) {
            int sum = 0;
            int tp = ++per;
            while (sum < n) {
                sum += tp++;
            }
            
            if (sum == n) {
                cnt++;
            }
        }
        return cnt;
    }
}