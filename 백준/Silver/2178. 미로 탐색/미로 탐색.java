import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Main {
    public static boolean[][] visit;
    public static int[][] graph;
    public static int[] dx = {-1, 0, 0, 1};
    public static int[] dy = {0, -1, 1, 0};
    public static int n, m;
    public static int[][] distance;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        n = Integer.parseInt(str[0]);
        m = Integer.parseInt(str[1]);
        visit = new boolean[n][m];
        distance = new int[n][m];
        String[] input = new String[n];
        for (int i = 0; i < n; i++) {
            input[i] = br.readLine();
        }
        graph = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                graph[i][j] = input[i].charAt(j) - '0';
            }
        }
        System.out.println(bfs(0, 0));
    }

    public static int bfs(int a, int b) {
        Queue<int[]> que = new LinkedList<>();
        que.offer(new int[]{a, b});
        visit[a][b] = true;
        distance[a][b] = 1;

        while (!que.isEmpty()) {
            int[] cur = que.poll();
            int x = cur[0];
            int y = cur[1];
            if (x == n-1 && y == m-1) {
                return distance[x][y];
            }
            for (int i = 0; i < 4; i++) {
                int nx = x+dx[i];
                int ny = y+dy[i];
                if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
                    if (graph[nx][ny] == 1 && !visit[nx][ny]) {
                        visit[nx][ny] = true;
                        distance[nx][ny] = distance[x][y]+1;
                        que.offer(new int[]{nx, ny});
                    }
                }
            }
        }
        return -1;
    }
}
