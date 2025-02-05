import java.util.*;

class Solution {
    boolean solution(String s) {
        Deque<Character> que = new ArrayDeque<>();
        char[] str = s.toCharArray();
        for (char c : str) {
            if (c == '(') {
                que.offer(c);
            } else {
                if (que.isEmpty()) return false;
                que.poll();
            }
        }
        if (!que.isEmpty()) return false;
        return true;
    }
}