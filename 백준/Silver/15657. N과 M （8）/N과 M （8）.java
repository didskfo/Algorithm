import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    static int N, M;
    static int[] arr;
    static int[] ans;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N];
        ans = new int[M];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        
        back_track(0, 0);
        System.out.println(sb);
    }

    static void back_track(int idx, int cnt) {
        if (cnt == M) {
            for (int a : ans) {
                sb.append(a + " ");
            }
            sb.append("\n");
            return;
        }

        for (int i = idx; i < N; i++) {
            ans[cnt] = arr[i];
            back_track(i, cnt+1);
        }
    }
}
