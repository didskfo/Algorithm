import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            char[] str = br.readLine().toCharArray();
            int a = 0;
            boolean check = true;
            for (char c : str) {
                if (c == '(') {
                    a++;
                } else {
                    if (a <= 0) {
                        check = false;
                        break;
                    } else a--;
                }
            }
            if (check == false || a != 0) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
