import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main {
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    public static boolean[] visit;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int cnt = 0;
        visit = new boolean[n+1];
        for (int i = 0; i < n+1; i++) {
            graph.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < m; i++) {
            String[] str = br.readLine().split(" ");
            graph.get(Integer.parseInt(str[0])).add(Integer.parseInt(str[1]));
            graph.get(Integer.parseInt(str[1])).add(Integer.parseInt(str[0]));
        }

        for (int i = 1; i < n+1; i++) {
            if (!visit[i]) {
                cnt++;
                dfs(i);
            }
        }
        System.out.println(cnt);
    }

    public static void dfs(int start) {
        visit[start] = true;
        for (int node : graph.get(start)) {
            if (!visit[node]) {
                dfs(node);
            }
        }
    }
}
