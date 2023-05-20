import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Node implements Comparable<Node> {
    int idx;
    double x, y;

    public Node(int idx, double x, double y) {
        this.idx = idx;
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Node other) {
        if (this.idx != other.idx) {
            return Integer.compare(this.idx, other.idx);
        }
        return 0;
    }
}

class Edge implements Comparable<Edge> {
    double dist;
    int s, e;

    public Edge(double dist, int s, int e) {
        this.dist = dist;
        this.s = s;
        this.e = e;
    }

    @Override
    public int compareTo(Edge other) {
        if (this.dist != other.dist) {
            return Double.compare(this.dist, other.dist);
        }
        return 0;
    }
}

public class BOJ4386 {
    public static int n, i, j, k;
    public static double x, y, dist;
    public static int[] parent;
    public static ArrayList<Node> nodeList = new ArrayList<>();
    public static ArrayList<Edge> edgeList = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(bf.readLine());

        parent = new int[n+1];
        for (int i = 0; i < n+1; i++) {
            parent[i] = i;
        }

        StringTokenizer st;
        for (i = 0; i < n; i++) {
            st = new StringTokenizer(bf.readLine());
            x = Double.parseDouble(st.nextToken());
            y = Double.parseDouble(st.nextToken());
            nodeList.add(new Node(i, x, y));
        }

        for (j = 0; j < n-1; j++) {
            for (k = j+1; k < n; k++) {
                dist = Math.sqrt(Math.pow(nodeList.get(j).x - nodeList.get(k).x, 2) + Math.pow(nodeList.get(j).y - nodeList.get(k).y, 2));
                edgeList.add(new Edge(dist, j, k));
            }
        }

        PriorityQueue<Edge> prique = new PriorityQueue<>(edgeList);

        double total = 0;
        int cnt = 0;

        while (!prique.isEmpty()) {
            Edge edge = prique.poll();

            int ur = find(edge.s);
            int vr = find(edge.e);

            if (ur != vr) {
                total += edge.dist;
                parent[ur] = vr;
                cnt++;
            }

            if (cnt > n-2) {
                break;
            }
        }

        bf.close();

        String result = String.format("%.2f", total);

        System.out.println(result);
    }

    public static int find(int u) {
        int r = u;
        while (parent[r] != r) {
            r = parent[r];
        }

        while (parent[u] != u) {
            int tmp_u = parent[u];
            parent[u] = r;
            u = tmp_u;
        }
        return r;
    }
}
