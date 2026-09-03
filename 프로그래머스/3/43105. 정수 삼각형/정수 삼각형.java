class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        int len = triangle.length;
        int[][] dp = new int[len][];
        for (int i = 0; i < len; i++) {
            dp[i] = new int[triangle[i].length];
        }
        
        dp[0][0] = triangle[0][0];
        for (int i = 1; i < len; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                if (j == 0) {
                    dp[i][j] = dp[i-1][j] + triangle[i][j];
                } else if (j == triangle[i].length-1) {
                    dp[i][j] = dp[i-1][j-1] + triangle[i][j];
                } else {
                    dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j]) + triangle[i][j];
                }
            }
        }
        
        for (int i = 0; i < triangle[len-1].length; i++) {
            answer = Math.max(answer, dp[len-1][i]);
        }
        return answer;
    }
}