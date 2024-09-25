import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    static int N, S, cnt;
    static int[] num;
    static boolean[] visit;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        num = new int[N];
        visit = new boolean[N];
        st = new StringTokenizer(br.readLine(), " ");
        cnt = 0;
        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }
        
        combination(0, 0);
        if (S == 0) System.out.println(cnt-1);
        else System.out.println(cnt);
    }

    static void combination(int idx, int sum) {
        if (idx == N) {
            if (sum == S) {
                cnt++;
            }
            return;
        }

        combination(idx+1, sum);
        combination(idx+1, sum+num[idx]);
    }
}