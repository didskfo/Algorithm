import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Main {
    public static int[] dist = new int[100001];
    public static boolean[] visit = new boolean[100001];
    public static int n;
    public static int k;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        n = Integer.parseInt(input[0]);
        k = Integer.parseInt(input[1]);
        System.out.println(bfs(n));
    }

    public static int bfs(int start) {
        Queue<Integer> que = new LinkedList<>();
        visit[start] = true;
        dist[start] = 0;
        que.add(start);

        while (!que.isEmpty()) {
            int cur = que.poll();
            if (k == cur) return dist[cur];
            int[] next = {cur-1, cur+1, cur*2};
            for (int n : next) {
                if (0 <= n && n < 100001 && !visit[n]) {
                    dist[n] = dist[cur]+1;
                    visit[n] = true;
                    que.add(n);
                }
            }
        }
        return 0;
    }
}
