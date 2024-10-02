import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    static int w, h;
    static int[][] map;
    static boolean[][] visit;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String str = st.nextToken();
            if (str.equals("0")) System.exit(0);
            w = Integer.parseInt(str);
            h = Integer.parseInt(st.nextToken());
            map = new int[h][w];
            visit = new boolean[h][w];
            int cnt = 0;
            for (int i = 0; i < h; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                for (int j = 0; j < w; j++) {
                    int a = Integer.parseInt(st.nextToken());
                    map[i][j] = a;
                }
            }
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (map[i][j] == 1) {
                        bfs(i, j);
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }        
    }

    static void bfs(int a, int b) {
        visit[a][b] = true;
        Queue<int[]> que = new LinkedList<>();
        que.add(new int[]{a, b});
        while (!que.isEmpty()) {
            int[] cur = que.poll();
            int x = cur[0];
            int y = cur[1];
            visit[x][y] = true;
            for (int i = 0; i < 8; i++) {
                int nx = x+dx[i];
                int ny = y+dy[i];
                if (nx>=0&&nx<h&&ny>=0&&ny<w&&!visit[nx][ny]&&map[nx][ny]==1) {
                    que.add(new int[]{nx, ny});
                    map[nx][ny] = 0;
                }
            }
        }
    }
}
