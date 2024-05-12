class Solution {
    static int answer = 0;
    public int solution(int[] numbers, int target) {
        dfs(numbers[0], 1, numbers, target);
        dfs(numbers[0]*-1, 1, numbers, target);
        return answer;
    }
    
    public void dfs(int num, int n, int[] numbers, int target) {
        if (n == numbers.length) {
            if (num == target) {
                answer++;
            }
            return;
        }
        
        dfs(num + numbers[n], n+1, numbers, target);
        dfs(num - numbers[n], n+1, numbers, target);
    }
}