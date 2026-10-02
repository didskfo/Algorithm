import java.util.*;

class Solution {
    static int[] parent;
    public int solution(int n, int[][] costs) {
        int answer = 0;
        Arrays.sort(costs, (a, b) -> Integer.compare(a[2], b[2]));
        
        parent = new int[n];
        
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
        
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
        int pa = find(a);
        int pb = find(b);
        
        if (pa > pb) parent[pa] = pb;
        else parent[pb] = pa;
    }
}