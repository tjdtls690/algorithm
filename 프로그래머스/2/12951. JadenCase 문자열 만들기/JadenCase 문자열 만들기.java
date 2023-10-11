class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            cnt++;
            char ch = s.charAt(i);
            
            if (cnt == 1 && Character.isLowerCase(ch)) {
                ch -= 32;
            } else if (cnt != 1 && Character.isUpperCase(ch)) {
                ch += 32;
            } else if (ch == ' ') {
                cnt = 0;
            }
            sb.append(ch);
        }
        
        return sb.toString();
    }
}