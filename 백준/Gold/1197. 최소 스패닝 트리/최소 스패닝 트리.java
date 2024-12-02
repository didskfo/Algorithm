import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Node implements Comparable<Node> {
    int u, v, c;

    public Node(int u, int v, int c) {
        this.u = u;
        this.v = v;
        this.c = c;
    }

    @Override
    public int compareTo(Node other) {
        if (this.c != other.c) {
            return Integer.compare(this.c, other.c);
        }
        return 0;
    }
}

public class Main {
    public static int n, m, u, v, c;
    public static int[] parent;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        parent = new int[n+1];
        for (int i = 0; i < n+1; i++) {
            parent[i] = i;
        }

        ArrayList<Node> nodeList = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(bf.readLine());
            u = Integer.parseInt(st.nextToken());
            v = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());

            nodeList.add(new Node(u, v, c));
        }

        PriorityQueue<Node> prique = new PriorityQueue<>(nodeList);

        int total = 0;
        int cnt = 0;

        while (!prique.isEmpty()) {
            Node node = prique.poll();

            int ur = find(node.u);
            int vr = find(node.v);

            if (ur != vr) {
                total += node.c;
                parent[ur] = vr;
                cnt++;
            }

            if (cnt > n-2) {
                break;
            }
        }

        bf.close();

        System.out.println(total);

    }

    public static int find(int u) {
        int r = u;
        while (parent[r] != r) {
            r = parent[r];
        }

        while(parent[u] != u) {
            int tmp_u = parent[u];
            parent[u] = r;
            u = tmp_u;
        }

        return r;
    }
}
