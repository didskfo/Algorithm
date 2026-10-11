import java.util.*;

class Solution {
    public int solution(int n, int k, int[] enemy) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());       
        int cnt = 0;
        for (int i = 0; i < enemy.length; i++) {
            n -= enemy[i];
            pq.offer(enemy[i]);
            
            if (n < 0) {
                if (k > 0) {
                    k--;
                    n += pq.poll();
                } else {
                    return i;
                }
            }
        }
        return enemy.length;
    }
}