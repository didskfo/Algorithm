import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    static int N;
    static int[] arr, dp, dp1, dp2;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        arr = new int[N];
        dp = new int[N];
        dp1 = new int[N];
        dp2 = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            dp1[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && dp1[i] < dp1[j]+1) {
                    dp1[i] = dp1[j]+1;
                }
            }
        }
        for (int i = N - 1; i >= 0; i--) {
            dp2[i] = 1;
            for (int j = N - 1; j > i; j--) {
                if (arr[i] > arr[j] && dp2[i] < dp2[j] + 1) {
                    dp2[i] = dp2[j] + 1;
                }
            }
        }
        int max = 0;
        for (int i = 0; i < N; i++) {
            dp[i] = dp1[i]+dp2[i]-1;
            max = Math.max(dp[i], max);
        }
        System.out.println(max);
    }
}
