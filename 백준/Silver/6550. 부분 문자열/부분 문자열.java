import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException{
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String s;
            String t;
            StringTokenizer st;
            StringBuilder sb = new StringBuilder();
            String str;
            while ((str = br.readLine()) != null) {
                st = new StringTokenizer(str, " ");
                s = st.nextToken();
                t = st.nextToken();
                int idx = 0;
                for (int i = 0; i < t.length(); i++) {
                    if (s.charAt(idx) == t.charAt(i)) idx++;
                    if (idx == s.length()) break;
                }
                sb.append(idx == s.length() ? "Yes" : "No").append("\n");
            }
            System.out.print(sb);
        }
    }
}
