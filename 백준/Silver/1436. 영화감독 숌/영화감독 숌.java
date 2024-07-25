import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        String num = "666";
        int number = 666;
        while (true) {
            String a = Integer.toString(number);
            if (a.contains(num)) {
                cnt++;
            }
            if (cnt == n) {
                System.out.println(number);
                break;
            }
            number++;
        }
    }
}
