import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main {
    static int n;
    static int[] parent;
    static boolean[] visit;
    static ArrayList<Integer> list[];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        parent = new int[n+1];
        visit = new boolean[n+1];
        list = new ArrayList[n+1];

        for (int i = 0; i < n+1; i++) {
            list[i] = new ArrayList<>();
        }
        for (int i = 1; i < n; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            list[a].add(b);
            list[b].add(a);
        }

        dfs(1);

        StringBuilder sb = new StringBuilder();
        for (int i = 2; i < n+1; i++) {
            sb.append(parent[i] + "\n");
        }
        System.out.println(sb.toString());
    }

    static void dfs(int start) {
        visit[start] = true;
        for (int i : list[start]) {
            if (!visit[i]) {
                parent[i] = start;
                dfs(i);
            }
        }
    }
}
