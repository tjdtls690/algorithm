class Solution {
    public int[] solution(String s) {
        int cnt = 0;
        int sum = 0;
        while (!s.equals("1")) {
            String ts = s.replace("0", "");
            
            cnt++;
            sum += s.length() - ts.length();
            
            s = Integer.toString(ts.length(), 2);
        }
        
        return new int[]{cnt, sum};
    }
}