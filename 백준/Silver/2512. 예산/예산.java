import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    static int N, M;
    static int[] arr;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int total = 0;
        int l = 1;
        int r = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            total += arr[i];
            r = Math.max(arr[i], r);
        }
        M = Integer.parseInt(br.readLine());
        
        if (total <= M) {
            System.out.println(r);
            return;
        }
        while (l <= r) {
            int mid = (l+r)/2;
            if (calculate(mid) > M) {
                r = mid-1;
            } else {
                l = mid+1;
            }
        }
        System.out.println(r);
    }

    static int calculate(int high) {
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += Math.min(arr[i], high);
        }
        return sum;
    }
}
