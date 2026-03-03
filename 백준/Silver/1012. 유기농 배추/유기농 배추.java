import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {
    static int[] dx = {-1, 0, 0, 1};
    static int[] dy = {0, -1, 1, 0};
    static int[][] ground;
    static int N, M;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            ground = new int[N][M];
            int cnt = 0;
            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int y = Integer.parseInt(st.nextToken());
                int x = Integer.parseInt(st.nextToken());
                ground[x][y] = 1;
            }
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (ground[i][j] == 1) {
                        cnt++;
                        bfs(i, j);
                    }
                }
            }
            System.out.println(cnt);
        }
    }

    static void bfs(int a, int b) {
        ground[a][b] = 0;
        Queue<int[]> que = new ArrayDeque<>();
        que.add(new int[]{a, b});
        while (!que.isEmpty()) {
            int[] cur = que.poll();
            int x = cur[0];
            int y = cur[1];
            for (int i = 0; i < 4; i++) {
                int nx = x+dx[i];
                int ny = y+dy[i];
                if (nx >= 0 && nx < N && ny >= 0 && ny < M && ground[nx][ny] == 1) {
                    que.add(new int[]{nx, ny});
                    ground[nx][ny] = 0;
                }
            }
        }
    }
}
