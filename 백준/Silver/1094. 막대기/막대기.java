import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int bar = 64;
        int cnt = 0;
        while (X > 0) {
            if (X == 64) {
                cnt++;
                break;
            }
            if (bar > X) {
                bar /= 2;
            } else {
                X -= bar;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
