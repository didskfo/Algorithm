import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        int len = S.length();
        int q = Integer.parseInt(br.readLine());
        int[][] dp = new int[26][len+1];
        for (int i = 0; i < len; i++) {
            int num = S.charAt(i) - 'a';
            for (int j = 0; j < 26; j++) {
                dp[j][i+1] = dp[j][i] + (j == num ? 1 : 0);
            }
        }

        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(br.readLine());
            char c = st.nextToken().charAt(0);
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            int num = c - 'a';
            sb.append(dp[num][r+1] - dp[num][l]).append('\n');
        }

        System.out.println(sb);
    }
}
