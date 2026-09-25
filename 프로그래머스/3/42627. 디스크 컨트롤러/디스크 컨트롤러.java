import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(a[1], b[1])
        );
        int count = 0;
        int before = -1;
        int time = 0;
        
        while (count < jobs.length) {
            for (int[] job : jobs) {
                if (job[0] <= time && job[0] > before) {
                    pq.add(job);
                }
            }
            
            if (!pq.isEmpty()) {
                int[] cur = pq.poll();
                before = time;
                time += cur[1];
                answer += time-cur[0];
                count++;
            } else {
                time++;
            }
        }
        return answer/jobs.length;
    }
}