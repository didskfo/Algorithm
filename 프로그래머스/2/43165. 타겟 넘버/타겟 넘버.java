import java.util.*;

class Solution {
    static int answer = 0;
    public int solution(int[] numbers, int target) {
        dfs(1, numbers, target, numbers[0]);
        dfs(1, numbers, target, -numbers[0]);
        return answer;
    }
    
    static void dfs(int n, int[] numbers, int target, int num) {
        if (n == numbers.length) {
            if (num == target) {
                answer++;
            }
            return;
        }
        dfs(n+1, numbers, target, num+numbers[n]);
        dfs(n+1, numbers, target, num-numbers[n]);
    }
}