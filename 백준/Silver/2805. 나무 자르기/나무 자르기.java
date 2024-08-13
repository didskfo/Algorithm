import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int start = 1;
        int end = 0;
        int mid = 0;
        int[] tree = new int[n];
        String[] str = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            tree[i] = Integer.parseInt(str[i]);
            end = Math.max(end, tree[i]);
        }
        end--;

        int ans = 0;
        while (start <= end) {
            mid = (start+end)/2;
            long sum = 0;
            for (int i = 0; i < n; i++) {
                if (tree[i] > mid) {
                    sum += tree[i]-mid;
                }
            }
            if (sum >= m) {
                start = mid+1;
                ans = mid;
            }
            else end = mid-1;
        }

        System.out.println(ans);
    }
}
