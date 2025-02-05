import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Deque<Integer> que = new ArrayDeque<>();
        for (int a : arr) {
            if (que.isEmpty() || que.peekLast() != a) {
                que.offer(a);
            } 
        }
        int[] answer = new int[que.size()];
        int idx = 0;
        for (Integer q : que) {
            answer[idx++] = q;
        }
        return answer;
    }
}