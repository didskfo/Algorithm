import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        boolean[] prime = new boolean[m+1];
        for (int i = 0 ; i < prime.length; i++) {
            prime[i] = true;
        }
        prime[0] = false;
        prime[1] = false;
        for (int i = 2; i <= Math.sqrt(m); i++) {
            if (prime[i]) {
                for (int j = i*i; j <= m; j+=i) {
                    prime[j] = false;
                }
            }
        }
        for (int i = n; i <= m; i++) {
            if (prime[i]) System.out.println(i);
        }
    }
}
