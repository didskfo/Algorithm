class Solution {
    public int solution(int[][] sizes) {
        int width = 0;
        int height = 0;
        for (int[] s : sizes) {
            int a = Math.max(s[0], s[1]);
            int b = Math.min(s[0], s[1]);
            width = Math.max(width, a);
            height = Math.max(height, b);
        }
        return width * height;
    }
}