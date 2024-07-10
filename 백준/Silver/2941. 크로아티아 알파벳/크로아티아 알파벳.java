import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int ans = 0;
        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
            if (a == 'c') {
                if (i+1 < str.length() && (str.charAt(i+1) == '=' || str.charAt(i+1) == '-')) {
                    ans++;
                    i++;
                    continue;
                } 
            }
            if (a == 'd') {
                if (i+1 < str.length() && str.charAt(i+1) == '-') {
                    ans++;
                    i++;
                    continue;
                } else if (i+2 < str.length() && str.charAt(i+1) == 'z' && str.charAt(i+2) == '=') {
                    ans++;
                    i+=2;
                    continue;
                }
            }
            if (a == 'l') {
                if (i+1 < str.length() && str.charAt(i+1) == 'j') {
                    ans++;
                    i++;
                    continue;
                }
            }
            if (a == 'n') {
                if (i+1 < str.length() && str.charAt(i+1) == 'j') {
                    ans++;
                    i++;
                    continue;
                }
            }
            if (a == 's' || a == 'z') {
                if (i+1 < str.length() && str.charAt(i+1) == '=') {
                    ans++;
                    i++;
                    continue;
                }
            }
            ans++;
        }
        System.out.println(ans);
    }
}