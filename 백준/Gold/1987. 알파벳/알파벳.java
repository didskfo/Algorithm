import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    static int R, C;
    static boolean[] visit = new boolean[26];
    static int[][] board;
    static int max = 1;
    static int[] dx = {-1, 0, 0, 1};
    static int[] dy = {0, -1, 1, 0};
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        board = new int[R][C];
        for (int i = 0; i < R; i++) {
            String input = br.readLine();
            for (int j = 0; j < C; j++) {
                board[i][j] = input.charAt(j)-'A';
            }
        }
        dfs(0, 0, 0);
        System.out.println(max);
    }

    static void dfs(int x, int y, int cnt) {
        if (visit[board[x][y]]) {
            max = Math.max(max, cnt);
            return;
        }
        visit[board[x][y]] = true;
        for (int i = 0; i < 4; i++) {
            int nx = x+dx[i];
            int ny = y+dy[i];
            if (nx>=0 && nx<R && ny>=0 && ny<C) {
                dfs(nx, ny, cnt+1);
            }
        }
        visit[board[x][y]] = false;
    }
}
