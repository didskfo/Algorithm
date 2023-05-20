import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

class Node {
    int end, weight;

    Node(int end, int weight) {
        this.end = end;
        this.weight = weight;
    }
}

public class BOJ1753v2 {
    public static int[] D;
    public static int[] S;
    public static int inf = Integer.MAX_VALUE;
    public static ArrayList<ArrayList<Node>> graph = new ArrayList<>();
    public static int u, v, w, cur , V, E, K;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine());
        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(bf.readLine());
        K = Integer.parseInt(st.nextToken());

        S = new int[V];
        D = new int[V];
        Arrays.fill(S, 0);
        Arrays.fill(D, inf);

        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(bf.readLine());
            u = Integer.parseInt(st.nextToken());
            v = Integer.parseInt(st.nextToken());
            w = Integer.parseInt(st.nextToken());

            graph.get(u-1).add(new Node(v, w));
        }

//        System.out.println("graph");
//        for (int i = 0; i < V; i++) {
//            for (int j = 0; j < graph.get(i).size(); j++) {
//                System.out.print(graph.get(i).get(j).end + " " + graph.get(i).get(j).weight + " ");
//            }
//            System.out.println();
//        }

        dijkstra(K);
        for (int i = 0; i < V; i++) {
            if (D[i] == inf) {
                System.out.println("INF");
                continue;
            }
            System.out.println(D[i]);
        }

//        for (int i = 0; i < V; i ++) {
//            System.out.print(D[i] + " ");
//        }
    }

    public static int findMin() {
        int min = inf;
        cur = 0;
        for (int i = 0; i < V; i++) {
            if (D[i] < min && S[i] == 0) {
                min = D[i];
                cur = i;
            }
        }
        return cur;
    }

    public static void dijkstra(int start) {
        D[start-1] = 0;
        S[start-1] = 1;

        for (int i = 0; i < graph.get(start-1).size(); i++) {
//            System.out.println(D[graph.get(start-1).get(i).end-1] + " " + graph.get(start-1).get(i).weight);
            if (D[graph.get(start-1).get(i).end-1] > graph.get(start-1).get(i).weight) {
                D[graph.get(start-1).get(i).end-1] = graph.get(start-1).get(i).weight;
            }
        }
//        System.out.println("D[i]");
//        for (int i = 0; i < V; i++) {
//            System.out.print(D[i] + " ");
//        }

        for (int i = 0; i < V; i++) {
            int idx = findMin();
//            System.out.println("idx" + idx);
            S[idx] = 1;
//            System.out.println(graph.get(idx).size());
            for (int k = 0; k < graph.get(idx).size(); k++) {
//                System.out.println(graph.get(idx).get(k).weight + D[idx] + " " + D[graph.get(idx).get(k).end-1]);
                if (graph.get(idx).get(k).weight + D[idx] < D[graph.get(idx).get(k).end-1]) {
                    D[graph.get(idx).get(k).end-1] = D[idx] + graph.get(idx).get(k).weight;
                }
            }
//            for (int q = 0; q < V; q++) {
//                System.out.print(D[q] + " ");
//            }
//            System.out.println();
        }

    }

}
