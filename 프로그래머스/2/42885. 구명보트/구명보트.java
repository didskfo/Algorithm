import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        Deque<Integer> que = new ArrayDeque<>();
        for (int p : people) {
            que.add(p);
        }
        while (que.size() > 1) {
            if (que.peek() + que.peekLast() <= limit) {
                que.poll();
                que.pollLast();
            } else {
                que.pollLast();
            }
            answer++;
        }
        return answer+que.size();
    }
}