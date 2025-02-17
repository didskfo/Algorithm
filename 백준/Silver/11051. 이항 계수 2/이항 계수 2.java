import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[][] num = new int[N+1][K+1];
        for (int i = 0; i <= N; i++) {
            num[i][0] = 1;
        }
        for (int i = 1; i <= K; i++) {
            num[0][i] = 0;
        }
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= K; j++) {
                num[i][j] = (num[i-1][j-1] + num[i-1][j])%10007;
            }
        }

        System.out.println(num[N][K]);
    }
}
