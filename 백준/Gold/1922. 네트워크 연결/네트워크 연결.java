import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Main {
    static class Node implements Comparable<Node>{
        int dest;
        int cost;
        public Node(int dest, int cost) {
            this.dest = dest;
            this.cost = cost;
        }

        @Override
        public int compareTo(Node node) {
            return Integer.compare(this.cost, node.cost);
        }
    }
    static int N, M, ans;
    static boolean[] visit;
    static ArrayList<ArrayList<Node>> arr = new ArrayList<>();
    public static void main(String[] args) throws IOException{
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            N = Integer.parseInt(br.readLine());
            M = Integer.parseInt(br.readLine());
            visit = new boolean[N+1];
            for (int i = 0; i <= N; i++) {
                arr.add(new ArrayList<>());
            }
            StringTokenizer st;
            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                int c = Integer.parseInt(st.nextToken());
                arr.get(a).add(new Node(b, c));
                arr.get(b).add(new Node(a, c));
            }
            Prim();
            System.out.println(ans);
        }
    }

    static void Prim() {
        PriorityQueue<Node> que = new PriorityQueue<>();
        que.offer(new Node(1, 0));
        while (!que.isEmpty()) {
            Node node = que.poll();
            int dest = node.dest;
            int cost = node.cost;
            if (!visit[dest]) {
                visit[dest] = true;
                ans += cost;
                for (Node n : arr.get(dest)) {
                    if (!visit[n.dest]) {
                        que.offer(n);
                    }
                }
            }
        }
    }
}
