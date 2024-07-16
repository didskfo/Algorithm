import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main {
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    public static boolean[] visit;
    public static int cnt = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        for (int i = 0; i < n+1; i++) {
            graph.add(new ArrayList<>());
        }
        visit = new boolean[n+1];
        for (int t = 0; t < m; t++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        dfs(1);
        System.out.println(cnt-1);
    }
    public static void dfs(int start) {
        visit[start] = true;
        cnt++;
        for (int i : graph.get(start)) {
            if (!visit[i]) {
                dfs(i);
            }
        }
    }
}
