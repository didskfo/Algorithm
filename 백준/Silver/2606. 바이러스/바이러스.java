import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean[] visit;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
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
        visit = new boolean[N+1];
        System.out.println(bfs(1));
    }
    
    static int bfs(int start) {
        Queue<Integer> que = new ArrayDeque<>();
        que.add(start);
        visit[start] = true;
        int cnt = 0;
        while (!que.isEmpty()) {
            int cur = que.poll();
            for (int n : graph.get(cur)) {
                if (!visit[n]) {
                    que.add(n);
                    visit[n] = true;
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
