import java.util.*;

class Solution {
    public int[][] solution(int[][] nodeinfo) {
        int n = nodeinfo.length;
        int[][] answer = new int[2][n];
        
        List<Node> nodes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nodes.add(new Node(nodeinfo[i][0], nodeinfo[i][1], i+1));
        }
        
        nodes.sort((a, b) -> {
            if (a.y == b.y) return Integer.compare(a.x, b.x);
            return Integer.compare(b.y, a.y);
        });
        
        Node root = nodes.get(0);
        
        for (int i = 1; i < n; i++) {
            insert(root, nodes.get(i));
        }
        
        List<Integer> pre = new ArrayList<>();
        preorder(root, pre);
        
        List<Integer> post = new ArrayList<>();
        postorder(root, post);
        
        for (int i = 0; i < n; i++) {
            answer[0][i] = pre.get(i);
            answer[1][i] = post.get(i);
        }
        
        return answer;
    }
    
    static void insert(Node parent, Node child) {
        if (child.x < parent.x) {
            if (parent.left == null) {
                parent.left = child;
            } else {
                insert(parent.left, child);
            }
        } else {
            if (parent.right == null) {
                parent.right = child;
            } else {
                insert(parent.right, child);
            }
        }
    }
    
    static void preorder(Node node, List<Integer> result) {
        if (node == null) return;
        
        result.add(node.idx);
        
        preorder(node.left, result);
        preorder(node.right, result);
    }
    
    static void postorder(Node node, List<Integer> result) {
        if (node == null) return;
        
        postorder(node.left, result);
        postorder(node.right, result);
        
        result.add(node.idx);
    }
}

class Node {
    int x;
    int y;
    int idx;
    Node left;
    Node right;
    
    Node(int x, int y, int idx) {
        this.x = x;
        this.y = y;
        this.idx = idx;
    }
}