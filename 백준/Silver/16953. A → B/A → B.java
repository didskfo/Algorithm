import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    static long A, B;
    static int ans = Integer.MAX_VALUE;
    static boolean possible;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        calculate(A, 1);
        if (!possible) ans = -1;
        System.out.println(ans);
    }

    static void calculate(long num, int cnt) {
        if (num == B) {
            ans = Math.min(cnt, ans);
            possible = true;
            return;
        }
        if (num > B) {
            return;
        }
        calculate(num*2, cnt+1);
        calculate(Long.parseLong(Long.toString(num)+"1"), cnt+1);
    }
}
