import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Deque<Integer> que = new ArrayDeque<>();
        Arrays.sort(people);
        for (int p : people) {
            que.add(p);
        }
        while (!que.isEmpty()) {
            if (que.size() == 1) {
                answer++;
                break;
            }
            if (que.peek() + que.peekLast() <= limit) {
                que.poll();
                que.pollLast();
            } else {
                que.pollLast();
            }
            answer++;
        }
        return answer;
    }
}