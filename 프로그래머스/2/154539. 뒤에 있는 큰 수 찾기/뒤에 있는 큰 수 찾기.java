import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int len = numbers.length;
        int[] answer = new int[len];
        Arrays.fill(answer, -1);
        Deque<Integer> stack = new ArrayDeque<>();
        
        for (int i = 0; i < len; i++) {
            while (!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) {
                int j = stack.pop();
                answer[j] = numbers[i];
            }
            stack.push(i);
        }
        return answer;
    }
}