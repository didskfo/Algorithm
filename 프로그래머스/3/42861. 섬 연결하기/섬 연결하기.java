import java.util.*;

class Solution {
    static int[] parent;
    public int solution(int n, int[][] costs) {
        int answer = 0;
        parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
        Arrays.sort(costs, (c1, c2) -> c1[2] - c2[2]);
        for (int[] cost : costs) {
            int a = cost[0];
            int b = cost[1];
            int c = cost[2];
            if (find(a) != find(b)) {
                union(a, b);
                answer += c;
            }
        }
        return answer;
    }
    
    static int find(int a) {
        if (a == parent[a]) return a;
        return find(parent[a]);
    }
    
    static void union(int a, int b) {
        a = find(a);
        b = find(b);
        if (a > b) parent[a] = b;
        else parent[b] = a;
    }
}