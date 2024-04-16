import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        int cur;
        int cnt;
        int idx = 0;
        Deque<Integer> que = new ArrayDeque<>();
        for (int i : prices) que.add(i);
        while (!que.isEmpty()) {
            cur = que.poll();
            cnt = 0;
            for (int q : que) {
                cnt++;
                if (cur > q) break;
            }
            answer[idx++] = cnt;
        }
        return answer;
    }
}