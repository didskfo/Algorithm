import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int m = Integer.parseInt(input[0]);
        int n = Integer.parseInt(input[1]);
        Integer[][] graph = new Integer[n][m];
        Queue<int[]> que = new LinkedList<>();
        int[] dx = {-1, 0, 0, 1};
        int[] dy = {0, -1, 1, 0};

        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                graph[i][j] = Integer.parseInt(str[j]);
                if (graph[i][j] == 1) {
                    que.add(new int[]{i, j});
                }
            }
        }

        while (!que.isEmpty()) {
            int[] cur = que.poll();
            int x = cur[0];
            int y = cur[1];
            for (int i = 0; i < 4; i++) {
                if (x+dx[i] >= 0 && x+dx[i] < n && y+dy[i] >= 0 && y+dy[i] < m && graph[x+dx[i]][y+dy[i]] == 0) {
                    que.add(new int[]{x+dx[i], y+dy[i]});
                    graph[x+dx[i]][y+dy[i]] = graph[x][y]+1;
                }
            }
        }

        boolean err = false;
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (graph[i][j] == 0) {
                    err = true;
                    break;
                } else {
                    cnt = Math.max(cnt, graph[i][j]);
                }
            }
        }
        
        if (err) System.out.println(-1);
        else System.out.println(cnt-1);
    }
}
