class Solution {
    static int answer = 0;
    
    public int solution(int[] numbers, int target) {
        dfs(1, target, numbers[0], numbers);
        dfs(1, target, -numbers[0], numbers);
        return answer;
    }
    
    static void dfs(int len, int target, int sum, int[] numbers) {
        if (len == numbers.length) {
            if (sum == target) answer++;
            return;
        }
        
        dfs(len+1, target, sum+numbers[len], numbers);
        dfs(len+1, target, sum-numbers[len], numbers);
    }
}