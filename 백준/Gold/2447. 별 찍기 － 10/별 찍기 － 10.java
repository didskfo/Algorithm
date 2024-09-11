import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    static int N;
    static char[][] graph;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        graph = new char[N][N];
        drawStar(0, 0, N, false);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(graph[i][j]);
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }

    static void drawStar(int x, int y, int n, boolean check) {
        if (check) {
            for (int i = x; i < x+n; i++) {
                for (int j = y; j < y+n; j++) {
                    graph[i][j] = ' ';
                }
            }
            return;
        }

        if (n <= 1) {
            graph[x][y] = '*';
            return;
        }

        int size = n/3;
        int cnt = 0;

        for (int i = x; i < x+n; i+=size) {
            for (int j = y; j < y+n; j+=size) {
                cnt++;
                if (cnt == 5) drawStar(i, j, size, true);
                else drawStar(i, j, size, false);
            }
        }
    }
}   
