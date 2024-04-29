import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> que = new PriorityQueue<>();
        for (int i : scoville) que.add(i);
        while (que.size() != 1) {
            if (que.element() < K) {
                int a = que.poll() + que.poll()*2;
                que.add(a);
                answer++;
            } else {
                return answer;
            }
        }
        if (que.element() < K) return -1;
        return answer;
    }
}