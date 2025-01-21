import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    static int N, res;
    static int[] arr;
    static int[] ans;
    static boolean[] visit;
    public static void main(String[] args) throws IOException{
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            ans = new int[N];
            visit = new boolean[N];
            combination(0);
            System.out.println(res);
        }
    }

    static void combination(int cnt) {
        if (cnt == N) {
            int sum = 0;
            for (int i = 0; i < N-1; i++) {
                sum += Math.abs(ans[i]-ans[i+1]);
            }
            res = Math.max(res, sum);
            return;
        }
        for (int i = 0; i < N; i++) {
            if (!visit[i]) {
                visit[i] = true;
                ans[cnt] = arr[i];
                combination(cnt+1);
                visit[i] = false;
            }
        }
    }
}
