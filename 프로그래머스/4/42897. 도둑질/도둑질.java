class Solution {
    public int solution(int[] money) {
        int first = cal(0, money.length-2, money);
        int second = cal(1, money.length-1, money);
        return Math.max(first, second);
    }
    
    static int cal(int start, int end, int[] money) {
        int[] dp = new int[end-start+1];
        dp[0] = money[start];
        if (dp.length >= 2) dp[1] = Math.max(money[start], money[start+1]);
        for (int i = 2; i < end-start+1; i++) {
            dp[i] = Math.max(dp[i-1], dp[i-2]+money[start+i]);
        }
        return dp[dp.length-1];
    }
}