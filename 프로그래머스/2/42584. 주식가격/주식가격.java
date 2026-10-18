class Solution {
    public int[] solution(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n];
        
        for (int i = 0; i < n-1; i++) {
            int cur = prices[i];
            int sec = 0;
            for (int j = i+1; j < n; j++) {
                sec++;
                if (cur > prices[j]) break;
            }
            answer[i] = sec;
        }
        return answer;
    }
}