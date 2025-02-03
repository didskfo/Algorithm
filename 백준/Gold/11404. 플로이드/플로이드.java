import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    static int n, m;
    static int[][] map;
    static int INF = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException{
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            n = Integer.parseInt(br.readLine());
            m = Integer.parseInt(br.readLine());
            map = new int[n][n];
            for (int i = 0; i < n; i++) {
                Arrays.fill(map[i], INF);
                map[i][i] = 0;  
            }
            StringTokenizer st;
            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                int c = Integer.parseInt(st.nextToken());
                map[a-1][b-1] = Math.min(map[a-1][b-1], c);
            }
            floydWarshall();

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (map[i][j] == INF) {
                        sb.append(0).append(" ");
                    } else {
                        sb.append(map[i][j]).append(" ");
                    }
                }
                sb.append("\n");
            }
            System.out.println(sb);
        }
    }
    static void floydWarshall() {
        for (int k = 0; k < n; k++) {
            for (int i = 0 ; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (map[i][k] != INF && map[k][j] != INF) {  
                        map[i][j] = Math.min(map[i][j], map[i][k] + map[k][j]);
                    }
                }
            }
        }
    }
}
