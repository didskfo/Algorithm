import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Node {
    int dest;
    int cost;
    Node(int dest, int cost) {
        this.dest = dest;
        this.cost = cost;
    }
}

class Main {
    static int N, M, X;
    static ArrayList<ArrayList<Node>> graph = new ArrayList<>();
    static ArrayList<ArrayList<Node>> graph_rev = new ArrayList<>();
    public static void main(String[] args) throws IOException{
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            X = Integer.parseInt(st.nextToken());
            for (int i = 0; i <= N; i++) {
                graph.add(new ArrayList<>());
                graph_rev.add(new ArrayList<>()); // 각 마을에서 X로 가는 최단거리를 구하기 위해 반대로 입력받아서 다익스트라 알고리즘 수행
            }
            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                int c = Integer.parseInt(st.nextToken());
                graph.get(a).add(new Node(b, c)); 
                graph_rev.get(b).add(new Node(a, c)); 
            }
            int[] distFromX = dijkstra(graph);
            int[] distToX = dijkstra(graph_rev);
            int ans = 0;
            for (int i = 1; i <= N; i++) {
                ans = Math.max(ans, distToX[i]+distFromX[i]);
            }
            System.out.println(ans);
        }
    }

    static int[] dijkstra(ArrayList<ArrayList<Node>> arr) {
        PriorityQueue<Node> pq = new PriorityQueue<>((n1, n2) -> Integer.compare(n1.cost, n2.cost));
        pq.offer(new Node(X, 0));
        boolean[] visit = new boolean[N+1];
        int[] dist = new int[N+1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[X] = 0;

        while (!pq.isEmpty()) {
            Node node = pq.poll();
            int cur = node.dest;
            if (!visit[cur]) {
                visit[cur] = true;
                for (Node n : arr.get(cur)) {
                    if (!visit[n.dest] && dist[n.dest] > dist[cur]+n.cost) {
                        dist[n.dest] = dist[cur]+n.cost;
                        pq.add(new Node(n.dest, dist[n.dest]));
                    }
                }
            }
        }
        return dist;
    }   
}
