import java.util.*;
class Solution {
    public int solution(int[] elements) {
        int len = elements.length;
        int[] circle = new int[2*len];
        System.arraycopy(elements, 0, circle, 0, len);
        System.arraycopy(elements, 0, circle, len, len);

        int[] dp = new int[2 * len + 1];
        for (int i = 0; i < 2 * len; i++) {
            dp[i+1] = dp[i] + circle[i];
        }
        
        Set<Integer> set = new HashSet<>();
        
        for (int k = 1; k <= len; k++) {
            for (int i = 0; i < len; i++) {
                set.add(dp[i + k] - dp[i]);
            }
        }
        return set.size();
    }
}