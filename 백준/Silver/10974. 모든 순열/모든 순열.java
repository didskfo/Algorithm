import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    static int N;
    static boolean[] visit;
    static int[] arr;
    static int[] res;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        visit = new boolean[N];
        arr = new int[N];
        for (int i = 1; i <= N; i++) {
            arr[i-1] = i;
        }
        res = new int[N];
        permutation(0);
        System.out.println(sb);
    }

    static void permutation(int cnt) {
        if (cnt == N) {
            for (int a : res) {
                sb.append(a).append(" ");
            }
            sb.append("\n");
            return;
        }
        for (int i = 0; i < N; i++) {
            if (!visit[i]) {
                visit[i] = true;
                res[cnt] = arr[i];
                permutation(cnt+1);
                visit[i] = false;
            }
        }
    }
}
