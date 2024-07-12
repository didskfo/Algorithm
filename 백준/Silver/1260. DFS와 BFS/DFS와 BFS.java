import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    public static boolean[] visit_dfs;
    public static boolean[] visit_bfs;
    public static ArrayList<Integer> res_dfs = new ArrayList<>();
    public static ArrayList<Integer> res_bfs = new ArrayList<>();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);
        int v = Integer.parseInt(arr[2]);

        visit_dfs = new boolean[n+1];
        visit_bfs = new boolean[n+1];

        for (int i = 0; i < n+1; i++) {
            graph.add(new ArrayList<Integer>());
        }

        for (int t = 0; t < m; t++) {
            String[] str = br.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        for (int i = 0; i < graph.size(); i++) {
            Collections.sort(graph.get(i));
        }
        dfs(v);
        bfs(v);
        for (int i = 0; i < res_dfs.size(); i++) {
            System.out.print(res_dfs.get(i) + " ");
        }
        System.out.println();
        for (int i = 0; i < res_bfs.size(); i++) {
            System.out.print(res_bfs.get(i) + " ");
        }
    }

    public static void dfs(int start) {
        visit_dfs[start] = true;
        res_dfs.add(start);
        for (int node : graph.get(start)) {
            if (!visit_dfs[node]) {
                dfs(node);
            }
        }
    }

    public static void bfs(int start) {
        visit_bfs[start] = true;
        Queue<Integer> que = new LinkedList<>();
        que.offer(start);

        while (!que.isEmpty()) {
            int node = que.poll();
            res_bfs.add(node);

            for (int n : graph.get(node)) {
                if (!visit_bfs[n]) {
                    que.offer(n);
                    visit_bfs[n] = true;
                }
            }
        }
    }
}