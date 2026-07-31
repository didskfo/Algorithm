import java.util.*;

class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = -1;
        Arrays.sort(mats);
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[0].length; j++) {
                if (park[i][j].equals("-1")) {
                    for (int l = mats.length-1; l >= 0; l--) {
                        if (check(i, j, mats[l], park)) {
                            answer = Math.max(answer, mats[l]);
                            break;
                        }
                    }
                }
            }
        }
        return answer;
    }
    
    static boolean check(int x, int y, int len, String[][] park) {
        for (int i = x; i < x+len; i++) {
            for (int j = y; j < y+len; j++) {
                if (i>=park.length || j>=park[0].length) return false;
                if (!park[i][j].equals("-1")) return false;
            }
        }
        return true;
    }
}