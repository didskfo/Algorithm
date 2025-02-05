import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int wide = 0;
        int height = 0;
        for (int[] size : sizes) {
            Arrays.sort(size);
            wide = Math.max(wide, size[0]);
            height = Math.max(height, size[1]);
        }
        return wide*height;
    }
}