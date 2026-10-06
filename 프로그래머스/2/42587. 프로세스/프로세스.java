import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<int[]> que = new ArrayDeque<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int i = 0; i < priorities.length; i++) {
            que.offer(new int[]{priorities[i], i});
            pq.offer(priorities[i]);
        }
        
        while (true) {
            int[] cur = que.poll();
            if (cur[0] < pq.peek()) {
                que.offer(cur);
            } else {
                pq.poll();
                answer++;
                if (cur[1] == location) {
                    break;
                }
            }
        } 
        return answer;
    }
}