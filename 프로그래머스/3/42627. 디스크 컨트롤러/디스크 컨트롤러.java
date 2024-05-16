import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;
        int time = 0;
        int idx = 0;
        int before = -1; 
        PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);
        
        while (idx < jobs.length) {
            for (int[] job : jobs) {
                if (before < job[0] && job[0] <= time) {
                    pq.add(job);
                }
            }
            
            if (!pq.isEmpty()) {
                int[] cur = pq.poll();
                before = time;
                time += cur[1];
                answer += time - cur[0];
                idx++;
            } else {
                time++;
            }
        }
        return answer/jobs.length;
    }
}