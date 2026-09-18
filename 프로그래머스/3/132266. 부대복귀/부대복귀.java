import java.util.*;

class Solution {
    public int[] solution(int n, int[][] roads, int[] sources, int destination) {
        int[] answer = new int[sources.length];
        
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        
        for (int[] road : roads) {
            graph.get(road[0]).add(road[1]);
            graph.get(road[1]).add(road[0]);
        }
        
        int[] dist = new int[n+1];
        Arrays.fill(dist, -1);
        
        Queue<Integer> que = new ArrayDeque<>();
        
        dist[destination] = 0;
        que.offer(destination);
        
        while (!que.isEmpty()) {
            int cur = que.poll();
            
            for (int next : graph.get(cur)) {
                if (dist[next] == -1) {
                    dist[next] = dist[cur]+1;
                    que.offer(next);
                }
            } 
        }
        
        for (int i = 0; i < sources.length; i++) {
            answer[i] = dist[sources[i]];
        }
        
        return answer;
    }
}