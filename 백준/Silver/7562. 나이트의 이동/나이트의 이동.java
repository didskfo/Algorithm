import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {
    static int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
    static int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1};
    static int l, cx, cy, x, y;
    static boolean[][] visit;
    static int[][] map;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for (int t = 0; t < T; t++) {
            l = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            cx = Integer.parseInt(st.nextToken());
            cy = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            visit = new boolean[l][l];
            map = new int[l][l];

            bfs();
            sb.append(map[x][y] + "\n");
        }
        System.out.println(sb.toString());
    }

    static void bfs() {
        Queue<int[]> que = new LinkedList<>();
        que.add(new int[]{cx, cy});
        visit[cx][cy] = true;

        while (!que.isEmpty()) {
            int[] cur = que.poll();
            int x1 = cur[0];
            int y1 = cur[1];
            for (int i = 0; i < 8; i++) {
                int nx = x1+dx[i];
                int ny = y1+dy[i];
                if (nx>=0&&nx<l&&ny>=0&&ny<l&&!visit[nx][ny]) {
                    que.add(new int[]{nx,ny});
                    map[nx][ny] = map[x1][y1]+1;
                    visit[nx][ny] = true;
                    if (nx == x && ny == y) return;
                }
            }
        }
    }
}
