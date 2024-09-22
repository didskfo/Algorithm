import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {
    static int n;
    static int[][] high;
    static int[][] water;
    static int max = 1;
    static int h = 1;
    static int l = 100;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        high = new int[n][n];
        water = new int[n][n];
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < n; j++) {
                int num = Integer.parseInt(st.nextToken());
                high[i][j] = num;
                h = Math.max(h, num);
                l = Math.min(l, num);
            }
        }
        for (int i = l; i < h; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (high[j][k] <= i) {
                        water[j][k] = 1;
                    } else {
                        water[j][k] = 0;
                    }
                }
            }
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (water[j][k] == 0) {
                        bfs(j, k);
                        cnt++;
                    }
                }
            }
            max = Math.max(max, cnt);
        }
        System.out.println(max);
    }

    static void bfs(int a, int b) {
        Queue<int[]> que = new LinkedList<>();
        water[a][b] = 1;
        que.add(new int[]{a, b});

        while (!que.isEmpty()) {
            int[] cur = que.poll();
            int x = cur[0];
            int y = cur[1];
            for (int i = 0; i < 4; i++) {
                int nx = x+dx[i];
                int ny = y+dy[i];
                if (nx>=0 && nx<n && ny>=0 && ny<n && water[nx][ny]==0) {
                    que.add(new int[]{nx, ny});
                    water[nx][ny] = 1;
                }
            }
        }
    }
}
