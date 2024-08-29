import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Main {
    static boolean[] prime = new boolean[246913];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        prime[0] = prime[1] = false;

        List<Integer> primeList = new ArrayList<>();
        for (int i = 2; i < 246913; i++) {
            if (isPrime(i)) primeList.add(i);
        }

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;
            int cnt = 0;
            for (int i = 0; i < primeList.size(); i++) {
                if (primeList.get(i) > n && primeList.get(i) <= 2*n) {
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }

    static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n%i == 0) return false;
        } return true;
    }
}
