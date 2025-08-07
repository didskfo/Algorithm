import java.util.*;
class Solution {
    public int solution(int[] order) {
        Deque<Integer> stack = new ArrayDeque<>();
        int idx = 0; 
        int answer = 0;
        int len = order.length;

        for (int i = 1; i <= len; i++) {
            if (order[idx] == i) {
                answer++;
                idx++;
                while (!stack.isEmpty() && stack.peek() == order[idx]) {
                    stack.pop();
                    answer++;
                    idx++;
                }
            }
            else {
                stack.push(i);
            }
        }

        while (!stack.isEmpty() && stack.peek() == order[idx]) {
            stack.pop();
            answer++;
            idx++;
        }

        return answer;
    }
}