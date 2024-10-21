import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    static int N, M;
    static int[] arr, ans;
    static boolean[] visit;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");
        arr = new int[N];
        ans = new int[M];
        visit = new boolean[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        combination(0);
        System.out.println(sb.toString());
    }

    static void combination(int cnt) {
        if (cnt == M) {
            for (int i = 0; i < M; i++) {
                sb.append(ans[i] + " ");
            }
            sb.append("\n");
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
