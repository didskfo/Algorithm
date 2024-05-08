import java.util.*;

class Solution {
    static int cnt_a, cnt_b, cnt, s;
    static Deque<Integer> que;
    public int solution(int n, int[][] wires) {
        int answer = n;
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n+1; i++) {
            graph.add(new ArrayList<>());
        }
        List<List<Boolean>> link_check = new ArrayList<>(n+1);
        for (int i = 0; i < n+1; i++) {
            link_check.add(new ArrayList<>(Collections.nCopies(n+1, true)));
        }
        List<Boolean> visited = new ArrayList<>(Collections.nCopies(n+1, false));
        
        for (int[] wire : wires) {
            graph.get(wire[0]).add(wire[1]);
            graph.get(wire[1]).add(wire[0]);
        }
        
        for (int[] wire : wires) {
            Collections.fill(visited, false);
            link_check.get(wire[0]).set(wire[1], false);
            cnt_a = bfs(wire[0], graph, link_check, visited);
            cnt_b = bfs(wire[1], graph, link_check, visited);
            link_check.get(wire[0]).set(wire[1], true);
            answer = Math.min(answer, Math.abs(cnt_a - cnt_b));
        }
        
        return answer;
    }
    
    public int bfs(int start, List<List<Integer>> graph, List<List<Boolean>> link_check, List<Boolean> visited) {
        que = new ArrayDeque<>();
        que.add(start);
        visited.set(start, true);
        cnt = 1;
        while(!que.isEmpty()) {
            s = que.poll();
            for (int v : graph.get(s)) {
                if (visited.get(v) == false && link_check.get(start).get(v) == true) {
                    que.add(v);
                    visited.set(v, true);
                    cnt++;
                }
            }
        }
        return cnt;
    }
}