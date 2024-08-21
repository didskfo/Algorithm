import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            Queue<int[]> que = new LinkedList<>();
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            st = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < n; i++) {
                int wei = Integer.parseInt(st.nextToken());
                que.offer(new int[]{i, wei});
                pq.offer(wei);
            }
            int cnt = 0;
            while (!que.isEmpty()) {
                int[] q = que.poll();
                int top = pq.poll();
                if (top == q[1]) {
                    cnt++;
                    if (q[0] == m) {
                        System.out.println(cnt);
                        break;
                    }
                } else {
                    pq.offer(top);
                    que.offer(q);
                }
            }
        }
    }
}
