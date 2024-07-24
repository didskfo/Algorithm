import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> que = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            if (input[0].equals("push")) que.add(Integer.parseInt(input[1]));
            else if (input[0].equals("pop")) {
                if (!que.isEmpty()) System.out.println(que.pollFirst());
                else System.out.println(-1);
            } else if (input[0].equals("size")) System.out.println(que.size());
            else if (input[0].equals("empty")) {
                if (!que.isEmpty()) System.out.println(0);
                else System.out.println(1);
            } else if (input[0].equals("front")) {
                if (!que.isEmpty()) System.out.println(que.peekFirst());
                else System.out.println(-1);
            } else if (input[0].equals("back")) {
                if (!que.isEmpty()) System.out.println(que.peekLast());
                else System.out.println(-1);
            }
        }
    }
}
