import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            String str = Integer.toString(i);
            boolean check = true;
            int minus = 0;
            if (str.length() > 1) {
                minus = str.charAt(1)-'0' - str.charAt(0)-'0';
            }
            for (int j = 1; j < str.length()-1; j++) {
                if (minus != str.charAt(j+1)-'0'-str.charAt(j)-'0') {
                    check = false;
                    continue;
                }
            }
            if (check) ans++;
        }
        System.out.println(ans);
    }
}
