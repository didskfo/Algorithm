import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[][] dp = new int[41][2];
        dp[0] = new int[]{1, 0};
        dp[1] = new int[]{0, 1};
        for (int i = 2; i < 41; i++) {
            int[] a = dp[i-1];
            int[] b = dp[i-2];
            dp[i] = new int[]{a[0]+b[0], a[1]+b[1]};
        }
        for (int T = 0; T < t; T++) {
            int n = Integer.parseInt(br.readLine());
            int[] res = dp[n];
            System.out.println(res[0] + " " + res[1]);
        }
    }
}
