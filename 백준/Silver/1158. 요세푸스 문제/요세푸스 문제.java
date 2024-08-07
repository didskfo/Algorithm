import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> que = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);

        for (int i = 1; i <= n; i++) {
            que.add(i);
        }

        int cnt = 0;
        while (!que.isEmpty()) {
            cnt++;
            if (cnt % k == 0) {
                sb.append(que.removeFirst());
                sb.append(", ");
            } else {
                que.add(que.removeFirst());
            }
        }
        sb.append(">");
        
        String answer = sb.toString().replace(", >", ">");
        System.out.println(answer);
    }
}
