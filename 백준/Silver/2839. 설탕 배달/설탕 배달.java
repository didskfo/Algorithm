import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 0;
        if (N % 5 == 0) {
            System.out.println(N / 5);
        } else {
            while (N > 0) {
                answer++;
                N -= 3;
                if (N % 5 == 0) {
                    answer += N / 5;
                    System.out.println(answer);
                    break;
                } 
                if (N < 3) {
                    System.out.println(-1);
                    break;
                }
            }
        }
    }
}
