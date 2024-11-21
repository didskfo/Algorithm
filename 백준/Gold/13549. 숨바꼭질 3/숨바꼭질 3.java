import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {
    static int N, K;
    static boolean[] visit;
    static int ans = Integer.MAX_VALUE;
    static int max = 100001;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        visit = new boolean[max];
        bfs();
        System.out.println(ans);
    }

    static void bfs() {
        Queue<Node> que = new LinkedList<>();
        que.offer(new Node(N, 0));

        while (!que.isEmpty()) {
            Node cur = que.poll();
            visit[cur.x] = true;
            if (cur.x == K) ans = Math.min(ans, cur.time);

            if (cur.x*2 < max && !visit[cur.x*2]) que.offer(new Node(cur.x*2, cur.time));
            if (cur.x+1 < max && !visit[cur.x+1]) que.offer(new Node(cur.x+1, cur.time+1));
            if (cur.x-1 >= 0 && !visit[cur.x-1]) que.offer(new Node(cur.x-1, cur.time+1));
        }
    }

    static class Node {
        int x;
        int time;
        public Node(int x, int time) {
            this.x = x;
            this.time = time;
        }
    }
}
