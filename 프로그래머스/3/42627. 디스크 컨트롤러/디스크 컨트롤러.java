import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        PriorityQueue<int[]> que = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);
        int answer = 0;
        int idx = 0;
        int before = -1;
        int time = 0;
        while (idx < jobs.length) {
            for (int[] job : jobs) {
                if (job[0] <= time && job[0] > before) {
                    que.add(job);
                }
            }
            if (!que.isEmpty()) {
                int[] cur = que.poll();
                before = time;
                time += cur[1];
                answer += time-cur[0];
                idx++;
            } else {
                time++;
            }
        }
        return answer/jobs.length;
    }
}