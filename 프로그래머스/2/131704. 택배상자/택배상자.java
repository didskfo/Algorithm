import java.util.*;
class Solution {
    public int solution(int[] order) {
        int answer = 0;
        Deque<Integer> que = new ArrayDeque<>();
        Deque<Integer> con = new ArrayDeque<>();
        for (int i = 1; i <= order.length; i++) {
            con.add(i);
        }
        int idx = 0;
        while (!que.isEmpty() || !con.isEmpty()) {
            if (!que.isEmpty() && que.peekLast() == order[idx]) {
                que.removeLast();
                idx++;
                answer++;
            } else if (!con.isEmpty() && con.peekFirst() == order[idx]) {
                con.removeFirst();
                idx++;
                answer++;
            } else if (!con.isEmpty()) {
                que.addLast(con.removeFirst());
            } else {
                break;
            }
        }
        return answer;
    }
}