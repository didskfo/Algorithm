import java.util.*;

class Solution {
    static Integer[] parent;
    public int solution(int n, int[][] computers) {
        parent = new Integer[n+1];
        for (int i = 0; i < n+1; i++) {
            parent[i] = i;
        }
        for (int i = 0; i < computers.length; i++) {
            for (int j = 0; j < computers[0].length; j++) {
                if (computers[i][j] == 1) {
                    if (i == j) continue;
                    union(i+1, j+1);
                }
            }
        }
        Set<Integer> set = new HashSet<Integer>();
        for (int a : parent) set.add(find(a));
        return set.size()-1;
    }
    
    public boolean union(int x, int y) {
        x = find(x);
        y = find(y);
        if (x == y) return false;
        if (x < y) parent[y] = x;
        else parent[x] = y;
        return true;
    }
    
    public int find(int x) {
        if (parent[x] == x) return x;
        return find(parent[x]);
    }
}