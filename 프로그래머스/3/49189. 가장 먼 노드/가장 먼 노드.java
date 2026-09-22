import java.util.*;

class Solution {
    public int solution(int n, int[][] edge) {
        int answer = 0;
        int[] dist = new int[n+1];
        int maxDist = 0;
        
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        
        for (int[] ed : edge) {
            graph.get(ed[0]).add(ed[1]);
            graph.get(ed[1]).add(ed[0]);
        }
        
        Deque<Integer> que = new ArrayDeque<>();
        que.offer(1);
        
        while (!que.isEmpty()) {
            int cur = que.poll();
            for (int a : graph.get(cur)) {
                if (dist[a] == 0) {
                    dist[a] = dist[cur] + 1;
                    maxDist = Math.max(maxDist, dist[a]);
                    que.offer(a);
                }
            }
        }
        
        for (int i = 2; i <= n; i++) {
            if (dist[i] == maxDist) answer++;
        }
        return answer;
    }
}