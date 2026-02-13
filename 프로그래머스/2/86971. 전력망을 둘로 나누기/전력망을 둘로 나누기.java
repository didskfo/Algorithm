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
        
        for (int[] w : wires) {
            graph.get(w[0]).add(w[1]);
            graph.get(w[1]).add(w[0]);
        }
        for (int[] w : wires) {
            visit = new boolean[n+1];
            link.get(w[0]).set(w[1], false);
            link.get(w[1]).set(w[0], false);
            int cnt_a = bfs(w[0]);
            int cnt_b = bfs(w[1]);
            answer = Math.min(answer, Math.abs(cnt_a - cnt_b));
            link.get(w[0]).set(w[1], true);
            link.get(w[1]).set(w[0], true);
        }
        return answer;
    }
    
    static int bfs(int start) {
        Queue<Integer> que = new ArrayDeque<>();
        que.add(start);
        visit[start] = true;
        int cnt = 1;
        
        while (!que.isEmpty()) {
            int cur = que.poll();
            for (int a : graph.get(cur)) {
                if (!visit[a] && link.get(cur).get(a)) {
                    visit[a] = true;
                    que.add(a);
                    cnt++;
                }
            }
        }
        return cnt;
    }
}