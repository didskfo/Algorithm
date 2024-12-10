import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<int[]> que = new ArrayDeque<>();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(st.nextToken());
            if (que.isEmpty()) {
                sb.append(0 + " ");
            } else {
                while (true) {
                    int[] cur = que.peekLast();
                    int idx = cur[0];
                    int num = cur[1];
                    if (num > input) {
                        sb.append(idx + " ");
                        break;
                    } else {
                        que.pollLast();
                    }

                    if (que.isEmpty()) {
                        sb.append(0 + " ");
                        break;
                    }
                }
            }
            que.add(new int[]{i+1, input});
        }

        System.out.println(sb);
    }
}
