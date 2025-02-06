import java.util.*;
class Pair {
    int lo;
    int pri;
    public Pair(int lo, int pri) {
        this.lo = lo;
        this.pri = pri;
    }
}
class Solution {
    public int solution(int[] priorities, int location) {
        Deque<Pair> que = new ArrayDeque<>();
        for (int i = 0; i < priorities.length; i++) {
            que.offer(new Pair(i, priorities[i]));
        }
        int answer = 0;
        while (!que.isEmpty()) {
            boolean flag = true;
            Pair cur = que.poll();
            for (Pair p : que) {
                if (cur.pri < p.pri) {
                    que.offer(cur);
                    flag = false;
                    break;
                }
            }
            if (flag) {
                answer++;
                if (cur.lo == location) return answer;
            }
        }
        return answer;
    }
}