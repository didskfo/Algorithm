import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int[][] map;
    static int[] dx = {-1, 0, 0, 1}, dy = {0, -1, 1, 0};
    static class Node {
        int x, y, broken, dist;
        Node(int x, int y, int b, int d) {
            this.x = x;
            this.y = y;
            this.broken = b;
            this.dist = d;
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = input.charAt(j) - '0';
            }
        }
        System.out.println(bfs());
    }

    static int bfs() {
        boolean[][][] visited = new boolean[N][M][2];
        Deque<Node> que = new ArrayDeque<>();
        que.offer(new Node(0, 0, 0, 1));
        visited[0][0][0] = true;

        while (!que.isEmpty()) {
            Node cur = que.poll();
            if (cur.x == N-1 && cur.y == M-1) return cur.dist;

            for (int i = 0; i < 4; i++) {
                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];
                if (nx>=0 && nx<N && ny>=0 && ny<M) {
                    if (map[nx][ny] == 0) {
                        if (!visited[nx][ny][cur.broken]) {
                            visited[nx][ny][cur.broken] = true;
                            que.offer(new Node(nx, ny, cur.broken, cur.dist+1));
                        }
                    } else {
                        if (cur.broken == 0 && !visited[nx][ny][1]) {
                            visited[nx][ny][1] = true;
                            que.offer(new Node(nx, ny, 1, cur.dist+1));
                        }
                    }
                }
            }
        }
        return -1;
    }
}
