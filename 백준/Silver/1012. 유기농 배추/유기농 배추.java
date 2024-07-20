import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Main {
    public static int[] dx = {-1, 0, 0, 1};
    public static int[] dy = {0, -1, 1, 0};
    public static int cnt;
    public static int[][] graph;
    public static int m, n;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            String[] mnk = br.readLine().split(" ");
            m = Integer.parseInt(mnk[0]);
            n = Integer.parseInt(mnk[1]);
            int k = Integer.parseInt(mnk[2]);
            cnt = 0;
            graph = new int[m][n];
            for (int K = 0; K < k; K++) {
                String[] xy = br.readLine().split(" ");
                int x = Integer.parseInt(xy[0]);
                int y = Integer.parseInt(xy[1]);
                graph[x][y] = 1;
            }
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (graph[i][j] == 1) {
                        bfs(i, j);
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
    }

    public static void bfs(int a, int b) {
        graph[a][b] = 0;
        Queue<int[]> que = new LinkedList<>();
        que.add(new int[]{a, b});
        while (!que.isEmpty()) {
            int[] cur = que.poll();
            int x = cur[0];
            int y = cur[1];
            for (int i = 0; i < 4; i++) {
                int nx = x+dx[i];
                int ny = y+dy[i];
                if (nx >= 0 && nx < m && ny >= 0 && ny < n && graph[nx][ny] == 1) {
                    graph[nx][ny] = 0;
                    que.add(new int[]{nx, ny});
                }
            }
        }
    }
}
