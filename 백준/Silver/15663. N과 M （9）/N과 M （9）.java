import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

class Main {
    static int N, M;
    static int[] arr;
    static int[] res;
    static boolean[] visit;
    static StringBuilder sb;
    static LinkedHashSet<String> ans = new LinkedHashSet<>();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N];
        res = new int[M];
        visit = new boolean[N];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        back_track(0);
        ans.forEach(System.out::println);
    }

    static void back_track(int cnt) {
        if (cnt == M) {
            sb = new StringBuilder();
            for (int i = 0; i < M; i++){
                sb.append(res[i] + " ");
            }
            ans.add(sb.toString());
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visit[i]) {
                visit[i] = true;
                res[cnt] = arr[i];
                back_track(cnt+1);
                visit[i] = false;
            }
        }
    }
}
