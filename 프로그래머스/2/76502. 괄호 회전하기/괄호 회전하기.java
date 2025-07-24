import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        String str = s+s;
        for (int i = 0; i < s.length(); i++) {
            Deque<Character> que = new ArrayDeque<>();
            boolean check = true;
            for (int j = 0; j < s.length(); j++) {
                char c = str.charAt(i+j);
                if (que.isEmpty()) {
                    que.add(c);
                } else if (c == '(' || c == '[' || c == '{') {
                    que.add(c);
                } else if (c == ')') {
                    if (que.peekLast() != '(') {
                        check = false;
                        break;
                    } else {
                        que.removeLast();
                    }
                } else if (c == ']') {
                    if (que.peekLast() != '[') {
                        check = false;
                        break;
                    } else {
                        que.removeLast();
                    }
                } else if (c == '}') {
                    if (que.peekLast() != '{') {
                        check = false;
                        break;
                    } else {
                        que.removeLast();
                    }
                }
            }
            if (check && que.isEmpty()) answer++;
        }
        return answer;
    }
}