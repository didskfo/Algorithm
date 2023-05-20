import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1916v2 {

    public static int inf = Integer.MAX_VALUE;
    public static int[][] graph;
    public static int n, m;
    public static int cur;
    public static int[] s;
    public static long[] d;


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(bf.readLine());
        m = Integer.parseInt(bf.readLine());

        graph = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
//                if (i == j) {
//                    graph[i][j] = 0;
//                    continue;
//                }
                graph[i][j] = inf;
            }
        }

        int u, v, w;
        StringTokenizer st;

        s = new int[n];
        d = new long[n];
        Arrays.fill(s, 0);
        Arrays.fill(d, inf);

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(bf.readLine());
            u = Integer.parseInt(st.nextToken());
            v = Integer.parseInt(st.nextToken());
            w = Integer.parseInt(st.nextToken());

            if (graph[u-1][v-1] == inf) {
                graph[u-1][v-1] = w;
            } else if (graph[u-1][v-1] > w) {
                graph[u-1][v-1] = w;
            }
        }
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(graph[i][j] + " ");
//            }
//            System.out.println();
//        }

        st = new StringTokenizer(bf.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        dijkstra(start);
        System.out.println(d[end-1]);

    }

    public static int findMin() {
        long min = inf;
        cur = 0;
        for (int i = 0; i < n; i++) {
            if (d[i] < min && s[i] == 0) {
                min = d[i];
                cur = i;
            }
        }
//        System.out.println("findmin" + cur);
        return cur;
    }

    public static void dijkstra(int start) {
        d[start-1] = 0;
        for (int i = 0; i < n; i++) {
//            System.out.print("graph[start][i]" + graph[start][i]);
//            System.out.print("d[i]" + d[i]);
//            System.out.println();
            if (graph[start-1][i] < d[i]) {
                d[i] = graph[start-1][i];
            }
        }
//        for (int i = 0; i < n; i++) {
//            System.out.print(d[i] + " ");
//        }
        s[start-1] = 1;
        for (int i = 0; i < n; i++) {
            int idx = findMin();
            s[idx] = 1;
            for (int j = 0; j < n; j++) {
                if (d[idx] + graph[idx][j] < d[j]) {
                    d[j] = d[idx] + graph[idx][j];
                }
            }
        }
//        for (int i = 0; i < n; i++) {
//            System.out.print(s[i] + " ");
//        }
    }
}
