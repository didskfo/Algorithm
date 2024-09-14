import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Main {
    static int n;
    static char[][] even, odd;
    static int[] dx = {-1, 0, 0, 1};
    static int[] dy = {0, -1, 1, 0};
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        even = new char[n][n];
        odd = new char[n][n];
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            for (int j = 0; j < n; j++) {
                even[i][j] = input.charAt(j);
                if (input.charAt(j) == 'G') {
                    odd[i][j] = 'R';
                } else {
                    odd[i][j] = input.charAt(j);
                }
            }
        }

        int cnt_even = 0;
        int cnt_odd = 0;
        for (int i = 0 ; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (even[i][j] != '0') {
                    cnt_even++;
                    bfs(i, j, even[i][j], even);
                }
                if (odd[i][j] != '0') {
                    cnt_odd++;
                    bfs(i, j, odd[i][j], odd);
                }
            }
        }

        System.out.println(cnt_even + " " + cnt_odd);
    }

    static void bfs(int a, int b, char c, char[][] graph) {
        char target = c;
        graph[a][b] = '0';
        Queue<int[]> que = new LinkedList<>();
        que.add(new int[]{a, b});
        while (!que.isEmpty()) {
            int[] cur = que.poll();
            int x = cur[0];
            int y = cur[1];
            for (int i = 0; i < 4; i++) {
                int nx = x+dx[i];
                int ny = y+dy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < n && graph[nx][ny] == target) {
                    graph[nx][ny] = '0';
                    que.add(new int[]{nx, ny});
                }
            }
        }
    }
}
