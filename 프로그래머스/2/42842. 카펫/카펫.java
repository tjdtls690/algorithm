class Solution {
    public int[] solution(int brown, int yellow) {
        int size = brown + yellow;
        
        for (int width = yellow + 2; width > 0; width--) {
            if (size % width != 0) {
                continue;
            }
            
            int height = size / width;
            
            if (yellow == (width - 2) * (height - 2)) {
                return new int[] {width, height};
            }
        }
        
        return null;
    }
}