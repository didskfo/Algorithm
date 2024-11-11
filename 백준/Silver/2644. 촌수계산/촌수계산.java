import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Main {
    static int n, p1, p2, m, ans;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean[] visit;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        p1 = Integer.parseInt(st.nextToken());
        p2 = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(br.readLine());
        visit = new boolean[n+1];
        for (int i = 0; i < n+1; i++) {
            graph.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph.get(x).add(y);
            graph.get(y).add(x);
        }

        dfs(p1, 0);
        if (visit[p2]) System.out.println(ans);
        else System.out.println(-1);
    }

    static void dfs(int start, int cnt) {
        visit[start] = true;
        if (start == p2) {
            ans = cnt;
            return;
        }
        for (int node : graph.get(start)) {
            if (!visit[node]) {
                dfs(node, cnt+1);
            }
        }
    }
}
