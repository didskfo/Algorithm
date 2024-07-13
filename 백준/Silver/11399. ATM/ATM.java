import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int[] peo = new int[n];
        for (int i = 0; i < n; i++) {
            peo[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(peo);
        int ans = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += peo[i];
            ans += sum;
        }
        System.out.println(ans);
    }
}