import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {
    static int N, L, R, cnt;
    static int[][] graph;
    static int[] dx = {-1, 0, 0, 1};
    static int[] dy = {0, -1, 1, 0};
    static boolean[][] visit;
    static boolean isChange;
    static ArrayList<int[]> list = new ArrayList<>();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        graph = new int[N][N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        change();
        System.out.println(cnt);
    }

    static void change() {
        while (true) {
            isChange = false;
            visit = new boolean[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (!visit[i][j]) {
                        bfs(i, j);
                    }
                }
            }
            if (!isChange) break;
            else cnt++;
        }
    }

    static void bfs(int a, int b) {
        Queue<int[]> que = new LinkedList<>();
        que.add(new int[]{a, b});
        visit[a][b] = true;
        list.add(new int[]{a, b});

        while (!que.isEmpty()) {
            int[] cur = que.poll();
            int x = cur[0];
            int y = cur[1];
            for (int i = 0; i < 4; i++) {
                int nx = x+dx[i];
                int ny = y+dy[i];
                if (nx>=0 && nx<N && ny>=0 && ny<N && !visit[nx][ny]) {
                    int dif = Math.abs(graph[x][y]-graph[nx][ny]);
                    if (dif >= L && dif <= R) {
                        isChange = true;
                        visit[nx][ny] = true;
                        que.add(new int[]{nx, ny});
                        list.add(new int[]{nx, ny});
                    }
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            int[] l = list.get(i);
            sum += graph[l[0]][l[1]];
        }
        int res = sum/list.size();
        for (int i = 0; i < list.size(); i++) {
            int[] l = list.get(i);
            graph[l[0]][l[1]] = res;
        }
        list.removeAll(list);
    }
}
