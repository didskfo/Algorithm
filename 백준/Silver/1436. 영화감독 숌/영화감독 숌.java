import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String six = "666";
        int num = 666;
        int cnt = 1;
        while (cnt != N) {
            num++;
            if (Integer.toString(num).contains(six)) {
                cnt++;
            }
        }
        System.out.println(num);
    }
}
