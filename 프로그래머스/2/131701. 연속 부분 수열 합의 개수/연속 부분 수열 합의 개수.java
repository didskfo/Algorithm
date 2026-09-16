import java.util.*;

class Solution {
    public int solution(int[] elements) {
        Set<Integer> res = new HashSet<>();
        int len = elements.length;
        int[] circle = new int[len*2];
        for (int i = 0; i < len; i++) {
            circle[i] = elements[i];
            circle[i+len] = elements[i];
        }
        
        int[] dp = new int[2*len+1];
        for (int i = 0; i < 2*len; i++) {
            dp[i+1] = dp[i] + circle[i];
        }
        
        for (int k = 1; k <= len; k++) {
            for (int i = 0; i < len; i++) {
                res.add(dp[i+k] - dp[i]);
            }
        }
        return res.size();
    }
}