import java.util.*;
class Solution {
    public int solution(int x, int y, int n) {
        int answer = -1;
        if (x == y) return 0;
        int[] dist = new int[y+1];
        Arrays.fill(dist, -1);
        Deque<Integer> que = new ArrayDeque<>();
        que.add(x);
        dist[x] = 0;
        
        while (!que.isEmpty()) {
            int cur = que.poll();
            if (cur == y) return dist[cur];
            int[] arr = {cur+n, cur*2, cur*3};
            for (int a : arr) {
                if (a <= y && dist[a] == -1) {
                    que.add(a);
                    dist[a] = dist[cur]+1;
                }
            }
        }
        return answer;
    }
}