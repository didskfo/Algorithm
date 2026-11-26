import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        char[][] map = new char[n][m];

        for (int i = 0; i < n; i++) {
            map[i] = br.readLine().toCharArray();
        }

        int[][] diff = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if ((i+j)%2 == 0) {
                    if (map[i][j] == 'B') diff[i][j] = 0;
                    else diff[i][j] = 1;
                } else {
                    if (map[i][j] == 'W') diff[i][j] = 0;
                    else diff[i][j] = 1;
                }
            }
        }

        int[][] sum = new int[n+1][m+1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                sum[i][j] = diff[i-1][j-1] + sum[i-1][j] + sum[i][j-1] - sum[i-1][j-1];
            }
        }

        int answer = Integer.MAX_VALUE;

        for (int i = k; i <= n; i++) {
            for (int j = k; j <= m; j++) {
                int cnt = sum[i][j] - sum[i-k][j] - sum[i][j-k] + sum[i-k][j-k];
                int repaint = Math.min(cnt, k*k-cnt);
                answer = Math.min(answer, repaint);
            }
        }

        System.out.println(answer);
    }
}
