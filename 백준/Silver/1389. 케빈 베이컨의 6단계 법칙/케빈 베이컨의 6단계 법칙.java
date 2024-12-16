import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] graph = new int[N][N];
        int INF = 100000;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) graph[i][j] = 0;
                else graph[i][j] = INF;
            }
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a-1][b-1] = 1;
            graph[b-1][a-1] = 1;
        }
        
        for (int k = 0; k < N; k++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (graph[i][k] + graph[k][j] < graph[i][j]) {
                        graph[i][j] = graph[i][k] + graph[k][j];
                    }
                }
            }
        }
        
        int[] sum = new int[N];
        int min = Integer.MAX_VALUE;
        int idx = -1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sum[i] += graph[i][j];
            }
            if (sum[i] < min) {
                min = sum[i];
                idx = i;
            }
        }
        System.out.println(idx+1);
    }
}
