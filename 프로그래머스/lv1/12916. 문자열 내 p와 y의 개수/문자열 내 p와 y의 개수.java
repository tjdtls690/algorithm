class Solution {
    boolean solution(String s) {
        return s.replaceAll("(?i)y", "").length() == s.replaceAll("(?i)p", "").length();
    }
}