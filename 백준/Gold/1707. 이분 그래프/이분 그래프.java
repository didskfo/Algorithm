import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {
    static int V, E;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] colorLst;
    public static void main(String[] args) throws IOException{
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int K = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();
            StringTokenizer st;
            for (int k = 0; k < K; k++) {
                st = new StringTokenizer(br.readLine(), " ");
                V = Integer.parseInt(st.nextToken());
                E = Integer.parseInt(st.nextToken());
                graph = new ArrayList<>();
                colorLst = new int[V+1];
                for (int i = 0; i <= V; i++) {
                    graph.add(new ArrayList<>());
                }
                for (int i = 0; i < E; i++) {
                    st = new StringTokenizer(br.readLine(), " ");
                    int u = Integer.parseInt(st.nextToken());
                    int v = Integer.parseInt(st.nextToken());
                    graph.get(u).add(v);
                    graph.get(v).add(u);
                }
                boolean check = true;
                for (int i = 1; i <= V; i++) {
                    if (colorLst[i] == 0) {
                        if (!checkBfs(i, 1)) {
                            check = false;
                            break;
                        }
                    }
                }
                sb.append(check ? "YES\n" : "NO\n");
            }
            System.out.println(sb);
        }
    }

    static boolean checkBfs(int start, int color) {
        Queue<Integer> que = new LinkedList<>();
        que.add(start);
        colorLst[start] = color;

        while (!que.isEmpty()) {
            int cur = que.poll();
            for (int a : graph.get(cur)) {
                if (colorLst[cur] == colorLst[a]) return false;
                if (colorLst[a] == 0) {
                    colorLst[a] = -colorLst[cur];
                    que.add(a);
                }
            }
        }
        return true;
    }
}
