import java.util.*;

class Solution {
    boolean solution(String s) {
        Deque<Character> dq = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                dq.add(ch);
            } else {
                if (dq.isEmpty()) {
                    dq.add(ch);
                    break;
                } else if (dq.peek() == '(') {
                    dq.pop();
                } else {
                    dq.add(ch);
                }
            }
        }
        
        return dq.isEmpty();
    }
}