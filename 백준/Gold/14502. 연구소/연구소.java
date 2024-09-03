import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {
    static int n, m;
    static int[][] origin;
    static int max = Integer.MIN_VALUE;
    static int[] dx = {-1, 0, 0, 1};
    static int[] dy = {0, -1, 1, 0};
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        origin = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < m; j++) {
                origin[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0);
        System.out.println(max);
    }

    static void dfs(int cnt) {
        if (cnt == 3) {
            bfs();
            return;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (origin[i][j] == 0) {
                    origin[i][j] = 1;
                    dfs(cnt+1);
                    origin[i][j] = 0;
                }
            }
        }
    }

    static void bfs() {
        int[][] copy = new int[n][m];
        for (int i = 0; i < n; i++) {
            copy[i] = origin[i].clone();
        }

        Queue<Node> que = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (origin[i][j] == 2) {
                    que.add(new Node(i, j));
                }
            }
        }

        while (!que.isEmpty()) {
            Node cur = que.poll();
            int x = cur.x;
            int y = cur.y;
            for (int i = 0; i < 4; i++) {
                int nx = x+dx[i];
                int ny = y+dy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                    if (copy[nx][ny] == 0) {
                        copy[nx][ny] = 2;
                        que.add(new Node(nx, ny));
                    }
                }
            }
        }

        countsafe(copy);
    }

    static class Node{
        int x;
        int y;
        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static void countsafe(int[][] copyMap) {
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (copyMap[i][j] == 0) {
                    cnt++;
                }
            }
        }
        if (max < cnt) {
            max = cnt;
        }
    }
}