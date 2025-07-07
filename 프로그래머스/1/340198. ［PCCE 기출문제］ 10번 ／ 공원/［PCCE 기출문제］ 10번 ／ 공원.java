import java.util.*;
class Solution {
    public int solution(int[] mats, String[][] park) {
        Arrays.sort(mats);
        for (int k = mats.length-1; k >= 0; k--) {
            int m = mats[k];
            for (int i = 0; i < park.length; i++) {
                for (int j = 0; j < park[0].length; j++) {
                    if (park[i][j].equals("-1")) {
                        boolean c = check(park, i, j, m);
                        if (c) return m;
                    }
                }
            }
        }
        return -1;
    }
    
    private boolean check(String[][] park, int x, int y, int len) {
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (x+i >= park.length || y+j >= park[0].length || !park[x+i][y+j].equals("-1")) return false;
            }
        }
        return true;
    }
}