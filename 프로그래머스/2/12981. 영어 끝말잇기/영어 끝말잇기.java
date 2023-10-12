
import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        Set<String> set = new HashSet<>();
        char last = '0';
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            char cf = word.charAt(0);
            if (set.contains(word) || (!set.isEmpty() && last != cf)) {
                return new int[] {i % n + 1, i / n + 1};
            }
            
            last = word.charAt(word.length() - 1);
            set.add(word);
        }
        
        return new int[] {0, 0};
    }
}