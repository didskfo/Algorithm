import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int cnt = 1;
    static int[][] map;
    static int N, M, r, c, d;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        st = new StringTokenizer(br.readLine(), " ");
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        clean(r, c, d);
        System.out.println(cnt);
    }

    static void clean(int x, int y, int direct) {
        map[x][y] = -1;
        for (int i = 0; i < 4; i++) {
            direct = (direct+3)%4;
            int nx = x+dx[direct];
            int ny = y+dy[direct];
            if (nx>=0 && nx<N && ny>=0 && ny<M && map[nx][ny]==0) {
                cnt++;
                clean(nx, ny, direct);
                return;
            }
        }
        int dir = (direct+2)%4;
        int bx = x+dx[dir];
        int by = y+dy[dir];
        if (bx>=0 && bx<N && by>=0 && by<M && map[bx][by]!=1) {
            clean(bx, by, direct);
        }
    }
}
