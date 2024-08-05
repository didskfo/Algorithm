import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] dp = new int[n][];
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            dp[i] = new int[input.length];
            for (int j = 0; j < input.length; j++) {
                dp[i][j] = Integer.parseInt(input[j]);
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                if (j == 0) {
                    dp[i][j] = dp[i-1][j] + dp[i][j];
                } else if (j == dp[i].length-1) {
                    dp[i][j] = dp[i-1][j-1] + dp[i][j];
                } else {
                    dp[i][j] = Math.max(dp[i-1][j-1]+dp[i][j], dp[i-1][j]+dp[i][j]);
                }
            }
        }

        int max = 0;
        for (int i = 0; i < dp[n-1].length; i++) {
            max = Math.max(max, dp[n-1][i]);
        }
        System.out.println(max);
    }
}
