import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int ans = 0;
        for (int t = 0; t < n; t++) {
            String str = br.readLine();
            Stack<Character> st = new Stack<>();
            boolean check = true;
            for (int i = 0; i < str.length(); i++) {
                char a = str.charAt(i);
                if (!st.contains(a)) {
                    st.add(a);
                } else {
                    if (st.peek() == a) {
                        st.add(a);
                    } else {
                        check = false;
                    }
                }
            }
            if (check) ans++;
        }
        System.out.println(ans);
    }
}