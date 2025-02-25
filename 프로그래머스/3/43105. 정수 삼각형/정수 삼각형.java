import java.util.*;

class Solution {
    public int solution(int[][] triangle) {
        int[][] dp = new int[triangle.length][];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = new int[triangle[i].length];
        }
        dp[0][0] = triangle[0][0];
        for (int i = 1; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                if (j == 0) dp[i][j] = dp[i-1][0] + triangle[i][0];
                else if (j == triangle[i].length-1) dp[i][j] = dp[i-1][j-1] + triangle[i][j];
                else dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j]) + triangle[i][j];
            }
        }
        return Arrays.stream(dp[dp.length-1]).max().getAsInt();
    }
}