import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int sc : scoville) {
            pq.offer(sc);
        }
        
        while (pq.size() >= 2) {
            if (pq.peek() < K) {
                pq.offer(pq.poll() + pq.poll()*2);
                answer++;
            } else {
                break;
            }
        }
        if (pq.poll() < K) return -1;
        return answer;
    }
}