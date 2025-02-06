import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int s : scoville) {
            pq.add(s);
        }
        while (pq.size() > 1) {
            int min = pq.poll();
            if (min >= K) break;
            answer++;
            pq.add(min+pq.poll()*2);
        }
        if (pq.poll() < K) return -1;
        return answer;
    }
}