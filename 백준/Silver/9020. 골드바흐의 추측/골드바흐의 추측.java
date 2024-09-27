import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            int n = Integer.parseInt(br.readLine());
            boolean[] prime = isPrime(n);
            int ans1 = 0; 
            int ans2 = n;
            for (int i = 1; i <= n/2; i++) {
                if (prime[i] && prime[n-i]) {
                    ans1 = i;
                    ans2 = n-i;
                }
            }
            System.out.println(ans1 + " " + ans2);
        }
    }

    static boolean[] isPrime(int a) {
        boolean[] prime = new boolean[a+1];
        for (int i = 0; i < a+1; i++) {
            prime[i] = true;
        }
        prime[0] = prime[1] = false;

        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (prime[i]) {
                for (int j = i*i; j <= a; j+=i) {
                    prime[j] = false;
                }
            }
        }
        return prime;
    }
}
