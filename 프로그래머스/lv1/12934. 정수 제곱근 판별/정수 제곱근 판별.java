class Solution {
    public long solution(long n) {
        double d = Math.sqrt(n);
        return d % 1 == 0 ? (long) Math.pow(d + 1, 2) : -1;
    }
}