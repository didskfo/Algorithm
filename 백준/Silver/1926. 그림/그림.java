import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

class Main {
    static int n, m;
    static int[][] map;
    static int[] dx = {-1, 0, 0, 1};
    static int[] dy = {0, -1, 1, 0};
    public static void main(String[] args) throws IOException{
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            map = new int[n][m];
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                for (int j = 0; j < m; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            int cnt = 0;
            int res = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (map[i][j] == 1) {
                        res = Math.max(res, bfs(i, j));
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
            System.out.println(res);
        }
    }
    static int bfs(int a, int b) {
        ArrayDeque<int[]> que = new ArrayDeque<>();
        que.offer(new int[]{a, b});
        map[a][b] = 0;
        int size = 1;
        while (!que.isEmpty()) {
            int[] cur = que.poll();
            int x = cur[0];
            int y = cur[1];
            for (int i = 0; i < 4; i++) {
                int nx = x+dx[i];
                int ny = y+dy[i];
                if (nx>=0 && ny>=0 && nx<n && ny<m && map[nx][ny]==1) {
                    que.offer(new int[]{nx, ny});
                    size++;
                    map[nx][ny] = 0;
                } 
            }
        }
        return size;
    }
}
