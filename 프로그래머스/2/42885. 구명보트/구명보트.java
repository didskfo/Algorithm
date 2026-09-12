import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        if (people.length == 1) return 1;
        
        Arrays.sort(people);
        Deque<Integer> que = new ArrayDeque<>();
        for (int p : people) {
            que.offer(p);
        }
        while (que.size() > 1) {
            if (que.peekLast() + que.peekFirst() <= limit) {
                answer++;
                que.pollLast();
                que.pollFirst();
            } else {
                answer++;
                que.pollLast();
            }
        }
        if (!que.isEmpty()) answer++;
        
        return answer;
    }
}