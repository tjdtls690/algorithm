import java.util.*;

class Solution
{
    public int solution(String s)
    {
        Deque<Character> dq = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (dq.isEmpty() || dq.peekLast() != ch) {
                dq.add(ch);
            } else if (dq.peekLast() == ch) {
                dq.removeLast();
            }
        }
        return dq.isEmpty() ? 1 : 0;
    }
}