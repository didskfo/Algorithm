import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Deque<Integer> que = new ArrayDeque<>();
        for (int in : ingredient) {
            que.offerFirst(in);
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
    
    static boolean check(Deque<Integer> que) {
        Iterator<Integer> it = que.iterator();
        int a = it.next();
        int b = it.next();
        int c = it.next();
        int d = it.next();
        
        return a == 1 && b == 3 && c == 2 && d == 1;
    }
}