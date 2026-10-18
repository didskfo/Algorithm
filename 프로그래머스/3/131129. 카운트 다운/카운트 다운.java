import java.util.*;

class Solution {
    public int[] solution(int target) {
        int[][] dp = new int[target+1][2];
        for (int i = 1; i <= target; i++) {
            dp[i][0] = Integer.MAX_VALUE;
            dp[i][1] = 0;
        }
        
        List<int[]> scores = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            scores.add(new int[]{i, 1});
            scores.add(new int[]{i*2, 0});
            scores.add(new int[]{i*3, 0});
        }
        scores.add(new int[]{50, 1});
        
        for (int i = 1; i <= target; i++) {
            for (int[] score : scores) {
                int s = score[0];
                int single = score[1];
                
                if (i - s < 0) {
                    continue;
                } 
                if (dp[i-s][0] == Integer.MAX_VALUE) {
                    continue;
                }
                
                int newDart = dp[i-s][0]+1;
                int newSingle = dp[i-s][1]+single;
                
                if (newDart < dp[i][0]) {
                    dp[i][0] = newDart;
                    dp[i][1] = newSingle;
                } else if (newDart == dp[i][0] && newSingle > dp[i][1]) {
                    dp[i][1] = newSingle;
                }
            }
        }
        return dp[target];
    }
}