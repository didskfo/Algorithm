import java.util.*;

class Solution {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean[] visit;
    public int solution(int n, int[][] computers) {
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < computers.length; i++) {
            for (int j = 0; j < computers[i].length; j++) {
                if (computers[i][j] == 1) {
                    graph.get(i).add(j);
                    graph.get(j).add(i);
                }
            }
        }
        visit = new boolean[n];
        int answer = 0;
        for (int i = 0; i < n; i++) {
            if (!visit[i]) {
                answer++;
                bfs(i);
            }
        }
        return answer;
    }
    
    static void bfs(int start) {
        visit[start] = true;
        Queue<Integer> que = new LinkedList<>();
        que.add(start);
        while (!que.isEmpty()) {
            int cur = que.poll();
            for (int a : graph.get(cur)) {
                if (!visit[a]) {
                    que.add(a);
                    visit[a] = true;
                }
            }
        }
    }
}