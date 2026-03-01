import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Character> stack;
        int answer = 0;
        for (int i = 0; i < N; i++) {
            char[] str = br.readLine().toCharArray();
            boolean check = true;
            stack = new Stack<>();
            for (char c : str) {
                if (!stack.contains(c)) {
                    stack.add(c);
                } else {
                    if (stack.peek() == c) {
                        stack.add(c);
                    } else {
                        check = false;
                        break;
                    }
                }
            }
            if (check) answer++;
        }
        System.out.println(answer);
    }
}
