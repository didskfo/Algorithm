import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int l = 0, r = 0, sum = 0, cnt = 0;

        while (true) {
            if (sum >= M) {
                sum -= arr[l];
                l++;
            } else if (r == N) break;
            else {
                sum += arr[r];
                r++;
            }
            if (sum == M) cnt++;
        }
        
        System.out.println(cnt);
    }
}
