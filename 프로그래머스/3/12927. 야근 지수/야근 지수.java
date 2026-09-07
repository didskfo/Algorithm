import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        PriorityQueue<Integer> que = new PriorityQueue<Integer>(Collections.reverseOrder());
        for (int w : works) {
            que.offer(w);
        }
        
        for (int i = 0; i < n; i++) {
            if (que.peek() == 0) return 0;
            int a = que.poll();
            a--;
            que.offer(a);
        }
        
        while (!que.isEmpty()) {
            answer += Math.pow(que.poll(), 2);
        }
        return answer;
    }
}