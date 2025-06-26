import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Deque<Integer> que = new ArrayDeque<>();
        for (int a : ingredient) {
            que.addFirst(a);
            if (que.size() >= 4) {
                if (check(que)) {
                    answer++;
                    for (int i = 0; i < 4; i++) {
                        que.removeFirst();
                    }
                }
            }
        }
        return answer;
    }
    
    private boolean check(Deque<Integer> que) {
        Iterator<Integer> it = que.iterator();
        int first  = it.next();
        int second = it.next();
        int third  = it.next();
        int fourth = it.next();

        return first  == 1 && second == 3 && third  == 2 && fourth == 1;
    }
}