import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> st = new Stack<>();
        String input = br.readLine();
        int ans = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') st.add('(');
            else {
                st.pop();
                if (input.charAt(i-1) == '(') ans += st.size();
                else ans++;
            }
        }
        System.out.println(ans);
    }
}
