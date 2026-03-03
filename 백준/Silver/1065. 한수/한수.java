import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 0;
        for (int i = 1; i <= N; i++) {
            if (i < 10) answer++;
            else {
                if (check(i)) answer++;
            }
        }
        System.out.println(answer);
    }

    static boolean check(int num) {
        char[] arr = Integer.toString(num).toCharArray();
        int check = arr[0] - arr[1];
        for (int i = 1; i < arr.length-1; i++) {
            if (arr[i] - arr[i+1] != check) return false;
        }
        return true;
    }
}
