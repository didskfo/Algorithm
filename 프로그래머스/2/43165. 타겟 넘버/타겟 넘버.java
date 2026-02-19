class Solution {
    static int answer = 0;
    public int solution(int[] numbers, int target) {
        dfs(1, numbers, target, numbers[0]);
        dfs(1, numbers, target, -numbers[0]);
        return answer;
    }
    
    static void dfs(int len, int[] numbers, int target, int num) {
        if (len == numbers.length) {
            if (num == target) answer++;
            return;
        }
        dfs(len+1, numbers, target, num+numbers[len]);
        dfs(len+1, numbers, target, num-numbers[len]);
    }
}