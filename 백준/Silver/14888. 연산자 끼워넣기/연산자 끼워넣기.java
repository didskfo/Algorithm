import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    static int n;
    static int[] num, cal;
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        num = new int[n];
        cal = new int[4];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < 4; i ++) {
            cal[i] = Integer.parseInt(st.nextToken());
        }

        dfs(num[0], 1);
        System.out.println(max);
        System.out.println(min);
    }

    static void dfs(int sum, int idx) {
        if (idx == n) {
            max = Math.max(max, sum);
            min = Math.min(min, sum);
            return;
        }
        for (int i = 0; i < 4; i++) {
            if (cal[i] > 0) {
                cal[i]--;
                if (i == 0) dfs(sum+num[idx], idx+1);
                else if (i == 1) dfs(sum-num[idx], idx+1);
                else if (i == 2) dfs(sum*num[idx], idx+1);
                else dfs(sum/num[idx], idx+1);
                cal[i]++;
            }
        }
    }
}
