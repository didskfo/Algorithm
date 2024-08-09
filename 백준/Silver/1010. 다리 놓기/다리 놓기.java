import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[][] dp = new int[30][30];
        for (int i = 0; i < 30; i++) {
            dp[i][0] = dp[i][i] = 1;
        }
        for (int i = 2; i < 30; i++) {
            for (int j = 1; j < i; j++) {
                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
            }
        }
        for (int t = 0; t < T; t++) {
            String[] input = br.readLine().split(" ");
            int n = Integer.parseInt(input[0]);
            int m = Integer.parseInt(input[1]);
            System.out.println(dp[m][n]);
        }
    }
}