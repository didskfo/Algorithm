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
        int answer = 0;
        int lo = 0;
        boolean flag = true;
        Deque<Pair> que = new ArrayDeque<>();
        for (int p : priorities) {
            que.add(new Pair(lo++, p));
        }
        while (que.size() != 0) {
            Pair cur = que.poll();
            flag = true;
            for (Pair p : que) {
                if (cur.pri < p.pri) {
                    que.add(cur);
                    flag = false;
                    break;
                }
            }
            if (flag) {
                answer++;
                if (cur.lo == location) return answer;
            };
        }
        
        return answer;
    }
}