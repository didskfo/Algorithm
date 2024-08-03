import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> st = new Stack<>();
        List<String> ans = new ArrayList<>();
        int num = 1;
        boolean err = false;
        for (int i = 0; i < n; i++) {
            int target = Integer.parseInt(br.readLine());
            while (num <= target) {
                st.add(num++);
                ans.add("+");
            }
            if (st.peek() == target) {
                st.pop();
                ans.add("-");
            } else {
                System.out.println("NO");
                err = true;
                break;
            }
        }

        if (!err) {
            for (int i = 0; i < ans.size(); i++) {
                System.out.println(ans.get(i));
            }
        }
    }
}
