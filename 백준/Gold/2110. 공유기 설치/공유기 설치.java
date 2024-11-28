import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        int ans = 0;
        int low = 0;
        int high = arr[N-1]-arr[0];
        while (low <= high) {
            int cnt = 1;
            int cur = arr[0];
            int mid = (low+high)/2;
            
            for (int i = 1; i < N; i++) {
                if (arr[i]-cur>=mid) {
                    cnt++;
                    cur = arr[i];
                }
            }
            if (cnt >= C) {
                ans = mid;
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        System.out.println(ans);
    }
}
