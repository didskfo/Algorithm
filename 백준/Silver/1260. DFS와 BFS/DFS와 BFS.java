import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean[] visit;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        for (int i = 0; i <= N; i++) {
            Collections.sort(graph.get(i));
        }
        visit = new boolean[N+1];
        dfs(V);
        System.out.println();
        visit = new boolean[N+1];
        bfs(V);
    }

    static void dfs(int start) {
        visit[start] = true;
        System.out.print(start + " ");
        for (int n : graph.get(start)) {
            if (!visit[n]) {
                dfs(n);
            }
        }
    }

    static void bfs(int start) {
        visit[start] = true;
        Queue<Integer> que = new ArrayDeque<>();
        que.offer(start);
        while (!que.isEmpty()) {
            int node = que.poll();
            System.out.print(node + " ");
            for (int n : graph.get(node)) {
                if (!visit[n]) {
                    que.add(n);
                    visit[n] = true;
                }
            }
        }     
    }
}
