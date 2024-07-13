import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int k = Integer.parseInt(str[1]);
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }
        int ans = 0;

        int idx = n-1;
        while (k != 0) {
            if (num[idx] <= k) {
                ans += k/num[idx];
                k %= num[idx];
            } 
            idx--;
        }
        System.out.println(ans);
    }
}
