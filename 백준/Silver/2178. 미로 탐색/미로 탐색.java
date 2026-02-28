import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {
    static char[][] miro;
    static boolean[][] visit;
    static int[][] dist;
    static int[] dx = {-1, 0, 0, 1};
    static int[] dy = {0, -1, 1, 0};
    static int N, M;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        miro = new char[N][M];
        visit = new boolean[N][M];
        dist = new int[N][M];
        for (int i = 0; i < N; i++) {
            miro[i] = br.readLine().toCharArray();
        }
        System.out.println(bfs(0, 0));
    }

    static int bfs(int a, int b) {
        Queue<int[]> que = new ArrayDeque<>();
        que.offer(new int[]{a, b});
        visit[a][b] = true;
        dist[a][b] = 1;
        while (!que.isEmpty()) {
            int[] cur = que.poll();
            int x = cur[0];
            int y = cur[1];
            if (x == N-1 && y == M-1) {
                return dist[x][y];
            }
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx >= 0 && nx < N && ny >= 0 && ny < M && !visit[nx][ny] && miro[nx][ny] == '1') {
                    visit[nx][ny] = true;
                    que.offer(new int[]{nx, ny});
                    dist[nx][ny] = dist[x][y]+1;
                }
            }
        }
        return -1;
    }
}
