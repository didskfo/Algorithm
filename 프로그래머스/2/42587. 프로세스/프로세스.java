import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<int[]> que = new ArrayDeque<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int idx = 0;
        for (int p : priorities) {
            que.add(new int[]{p, idx++});
            pq.add(p);
        }
        
        while (true) {
            int[] cur = que.poll();
            if (cur[0] < pq.peek()) {
                que.add(cur);
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