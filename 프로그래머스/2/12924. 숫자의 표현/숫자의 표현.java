class Solution {
    public int solution(int n) {
        int answer = 0;
        int low = 1; int high = 1;
        int sum = 1;
        while (low <= n) {
            if (sum == n) {
                answer++;
                sum -= low;
                low++;
            } else if (sum < n) {
                high++;
                sum += high;
            } else {
                sum -= low;
                low++;
            }
        }
        return answer;
    }
}