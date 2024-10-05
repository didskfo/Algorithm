import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            int n = Integer.parseInt(br.readLine());
            int[][] cost = new int[2][n+1];
            int[][] dp = new int[2][n+1];
            StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < n; i++) {
                cost[0][i] = Integer.parseInt(st1.nextToken());
                cost[1][i] = Integer.parseInt(st2.nextToken());
            }
            dp[0][0] = cost[0][0];
            dp[1][0] = cost[1][0];
            dp[0][1] = dp[1][0] + cost[0][1];
            dp[1][1] = dp[0][0] + cost[1][1];
            int max = Math.max(dp[0][1], dp[1][1]);
            for (int i = 2; i < n; i++) {
                dp[0][i] = Math.max(dp[1][i-1], dp[1][i-2]) + cost[0][i];
                dp[1][i] = Math.max(dp[0][i-1], dp[0][i-2]) + cost[1][i];
                max = Math.max(dp[0][i], dp[1][i]);
            }
            System.out.println(max);
        }
    }
}
