import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String input = br.readLine();
            if (input.equals(".")) break;
            boolean ans = true;
            Stack<Character> st = new Stack<>();
            for (int s = 0; s < input.length(); s++) {
                Character ch = input.charAt(s);
                if (ch == '(' || ch == '[') {
                    st.add(ch);
                } else if (ch == ')') {
                    if (st.isEmpty() || st.peek()  == '[') {
                        ans = false;
                        break;
                    } else {
                        st.pop();
                    }
                } else if (ch == ']') {
                    if (st.isEmpty() || st.peek() == '(') {
                        ans = false;
                        break;
                    } else {
                        st.pop();
                    }
                }
            }
            if (!st.isEmpty()) ans = false;
            
            if (ans) System.out.println("yes");
            else System.out.println("no");
        }
    }
}
