import java.util.*;

class Solution {
    static ArrayList<ArrayList<Boolean>> link = new ArrayList<>();
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean[] visit;
    public int solution(int n, int[][] wires) {
        int answer = n;
        for (int i = 0; i <= n; i++) {
            link.add(new ArrayList<>(Collections.nCopies(n+1, true)));
            graph.add(new ArrayList<>());
        }
        for (int[] wire : wires) {
            graph.get(wire[0]).add(wire[1]);
            graph.get(wire[1]).add(wire[0]);
        }
        for (int[] wire : wires) {
            visit = new boolean[n+1];
            link.get(wire[0]).set(wire[1], false);
            int cnt_a = bfs(wire[0]);
            int cnt_b = bfs(wire[1]);
            answer = Math.min(answer, Math.abs(cnt_a-cnt_b));
            link.get(wire[0]).set(wire[1], true);
        }
        return answer;
    }
    
    static int bfs(int start) {
        Queue<Integer> que = new LinkedList<>();
        que.add(start);
        visit[start] = true;
        int cnt = 1;
        
        while (!que.isEmpty()) {
            int cur = que.poll();
            for (int n : graph.get(cur)) {
                if (!visit[n] && link.get(cur).get(n)) {
                    visit[n] = true;
                    que.add(n);
                    cnt++;
                }
            }
        }
        return cnt;
    }
}