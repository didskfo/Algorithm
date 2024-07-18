import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        Stack<Integer> st = new Stack<>();
        int ans = 0;
        for (int k = 0; k < K; k++) {
            int a = Integer.parseInt(br.readLine());
            if (a == 0) {
                st.pop();
            } else {
                st.push(a);
            }
        }
        while (!st.isEmpty()) {
            ans += st.pop();
        }
        System.out.println(ans);
    }
}
