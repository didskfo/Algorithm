import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException{
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st;
            int[][] wire = new int[N][2];
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                wire[i][0] = Integer.parseInt(st.nextToken());
                wire[i][1] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(wire, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return Integer.compare(o1[0], o2[0]);
                }
            });
            int[] dp = new int[N];
            for (int i = 0; i < N; i++) {
                dp[i] = 1;
                for (int j = 0; j < i; j++) {
                    if (wire[i][1] > wire[j][1]) {
                        dp[i] = Math.max(dp[i], dp[j]+1);
                    }
                }
            }
            System.out.println(N-Arrays.stream(dp).max().getAsInt());
        }
    }
}
