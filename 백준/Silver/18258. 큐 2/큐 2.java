import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque<String> que = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            switch(input[0]) {
                case "push": que.add(input[1]);
                            break;
                case "pop": if (que.isEmpty()) sb.append(-1 + "\n");
                            else sb.append(que.poll() + "\n");
                            break;
                case "size": sb.append(que.size() + "\n");
                             break;
                case "empty": if (que.isEmpty()) sb.append(1 + "\n");
                              else sb.append(0 + "\n");
                              break;
                case "front": if (que.isEmpty()) sb.append(-1 + "\n");
                              else sb.append(que.peek() + "\n");
                              break;
                case "back": if (que.isEmpty()) sb.append(-1 + "\n");
                             else sb.append(que.peekLast() + "\n");
                             break;
            }
        }
        System.out.println(sb.toString());
    }
}
