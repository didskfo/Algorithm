import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int p1 = 0; 
        int p2 = 0;
        int ans = N+1;
        int sum = arr[0];
        while (p1 <= p2) {
            if (sum >= S) {
                sum -= arr[p1];
                ans = Math.min(ans, p2-p1+1);
                p1++;
            } else {
                p2++;
                if (p2 == N) break;
                sum += arr[p2];
            }
        }
        if (ans == N+1) System.out.println(0);
        else System.out.println(ans);
    }
}
