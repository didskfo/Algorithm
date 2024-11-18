import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    static int n, m;
    static int[] parent;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        parent = new int[n+1];
        for (int i = 0; i < n+1; i++) {
            parent[i] = i;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int ch = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (ch == 0) {
                union(a, b);
            } else {
                int ap = find(a);
                int bp = find(b);
                if (ap == bp) sb.append("YES\n");
                else sb.append("NO\n");
            }
        }
        System.out.println(sb.toString());
    }

    static void union(int x, int y) {
        x = find(x);
        y = find(y);
        if (x == y) return;
        if (x <= y) parent[y] = x;
        else parent[x] = y;
    }

    static int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }
}
