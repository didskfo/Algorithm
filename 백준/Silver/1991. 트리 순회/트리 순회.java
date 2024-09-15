import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    static Node head = new Node("A", null, null);
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String root = st.nextToken();
            String left = st.nextToken();
            String right = st.nextToken();
            insert(head, root, left, right);
        }

        preOrder(head);
        sb.append("\n");
        inOrder(head);
        sb.append("\n");
        postOrder(head);
        System.out.println(sb.toString());
    }

    static void insert(Node node, String root, String left, String right) {
        if (node.data.equals(root)) {
            node.left = left.equals(".") ? null : new Node(left, null, null);
            node.right = right.equals(".") ? null : new Node(right, null, null);
        } else {
            if (node.left != null) insert(node.left, root, left, right);
            if (node.right != null) insert(node.right, root, left, right);
        }
    }

    static void preOrder(Node root) {
        if (root == null) return;
        sb.append(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

    static void inOrder(Node root) {
        if (root == null) return;
        inOrder(root.left);
        sb.append(root.data);
        inOrder(root.right);
    }

    static void postOrder(Node root) {
        if (root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        sb.append(root.data);
    }

    static class Node {
        String data;
        Node left, right;
        public Node(String d, Node left, Node right) {
            this.data = d;
            this.left = left;
            this.right = right;
        }
    }
}
