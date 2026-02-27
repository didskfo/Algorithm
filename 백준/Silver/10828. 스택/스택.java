import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<String> stack = new Stack<>();
        while (N-- > 0) {
            String[] input = br.readLine().split(" ");
            String order = input[0];
            if (order.equals("push")) {
                stack.add(input[1]);
            } else if (order.equals("pop")) {
                if (stack.size() > 0) {
                    System.out.println(stack.pop());
                } else System.out.println(-1);
            } else if (order.equals("size")) {
                System.out.println(stack.size());
            } else if (order.equals("empty")) {
                if (stack.isEmpty()) System.out.println(1);
                else System.out.println(0);
            } else if (order.equals("top")) {
                if (stack.size() > 0) {
                    System.out.println(stack.peek());
                } else System.out.println(-1);
            }
        }
    }
}
