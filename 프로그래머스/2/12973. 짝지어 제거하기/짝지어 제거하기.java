import java.util.*;
class Solution
{
    public int solution(String s)
    {
        char[] str = s.toCharArray();
        Deque<Character> que = new ArrayDeque<>();
        for (int i = 0; i < str.length; i++) {
            if (que.isEmpty() || que.getLast() != str[i]) {
                que.add(str[i]);
            } else {
                que.removeLast();
            } 
        }
        if (que.isEmpty()) return 1;
        else return 0;
    }
}