class Solution {
    public int solution(int n) {
        int[] dp = new int[n];
        if (n == 1 || n == 2) {
            return n;
        }
        dp[0] = 1;
        dp[1] = 2;
        for (int i = 2; i < n; i++) {
            dp[i] = (dp[i-1] + dp[i-2])%1_000_000_007;
        }
        return dp[n-1];
    }
}