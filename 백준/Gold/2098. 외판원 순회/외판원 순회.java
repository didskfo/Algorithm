import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    static int n;
    static int[][] map;
    static int[][] dp;
    static int INF = 11000000;
    public static void main(String[] args) throws IOException{
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            n = Integer.parseInt(br.readLine());
            map = new int[n][n];
            dp = new int[n][(1<<n)-1];
            StringTokenizer st;
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                for (int j = 0; j < n; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            for (int i = 0; i < n; i++) {
                Arrays.fill(dp[i], -1);
            }
            System.out.println(dfs(0, 1));
        }
    }

    static int dfs(int cur, int bitMask) {
        if (bitMask == (1 << n)-1) {
            return map[cur][0] == 0 ? INF : map[cur][0];
        }
        if (dp[cur][bitMask] != -1) {
            return dp[cur][bitMask];
        }
        dp[cur][bitMask] = INF;
        for (int i = 0; i < n; i++) {
            if ((bitMask & (1 << i)) == 0 && map[cur][i] != 0) {
                dp[cur][bitMask] = Math.min(dp[cur][bitMask], dfs(i, bitMask | (1<<i)) + map[cur][i]);
            }
        }
        return dp[cur][bitMask];
    }
}
