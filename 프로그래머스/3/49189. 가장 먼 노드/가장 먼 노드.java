import java.util.*;

class Solution {
    public int solution(int n, int[][] edge) {
        int[] visited = new int[n+1];
        int max = 0;
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n+1; i++) {
            graph.add(new ArrayList<>());
            visited[i] = 0;
        }
        for (int[] ed : edge) {
            graph.get(ed[0]).add(ed[1]);
            graph.get(ed[1]).add(ed[0]);
        }
        
        Deque<Integer> que = new LinkedList<>();
        que.offer(1);
        while (!que.isEmpty()) {
            int cur = que.poll();
            for (int c : graph.get(cur)) {
                if (visited[c] == 0) {
                    visited[c] = visited[cur] + 1;
                    max = visited[c];
                    que.offer(c);
                }
            }
        }
        
        int answer = 0;
        for (int i = 2; i <= n; i++) {
            if (visited[i] == max) answer++;
        }
        return answer;
    }
}