class Solution {
    public int solution(int n) {
        int length = Integer.toString(n, 2).replace("0", "").length();
        for (int i = n + 1; ; i++) {
            if (isAnswer(n, i, length)) {
                return i;
            }
        }
    }
    
    private boolean isAnswer(int n, int i, int length) {
        return length == Integer.toString(i, 2).replace("0", "").length();
    }
}