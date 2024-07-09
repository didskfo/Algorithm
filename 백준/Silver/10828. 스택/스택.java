import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class Main {
    static Stack<Integer> stack = new Stack<>();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int t = 0; t < n; t++) {
            String str = br.readLine();
            String[] arr = str.split(" ");
            if (arr[0].equals("push")) push(Integer.parseInt(arr[1]));
            else if (arr[0].equals("pop")) System.out.println(pop());
            else if (arr[0].equals("size")) System.out.println(size());
            else if (arr[0].equals("empty")) System.out.println(empty());
            else if (arr[0].equals("top")) System.out.println(top());
        }
    }
    public static void push(int x) {
        stack.add(x);
    }
    public static int pop() {
        if (stack.size() != 0) return stack.pop();
        return -1;
    }
    public static int size() {
        return stack.size();
    }
    public static int empty() {
        if (stack.isEmpty()) return 1;
        return 0;
    }
    public static int top() {
        if (stack.isEmpty()) return -1;
        return stack.peek();
    }
}