import java.util.*;

class Solution {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static int answer = 0;
    static int[] info;
    public int solution(int[] info, int[][] edges) {
        this.info = info;
        
        for (int i = 0; i < info.length; i++) {
            graph.add(new ArrayList<>());
        }
        
        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
        }
        
        List<Integer> next = new ArrayList<>();
        for (int n : graph.get(0)) {
            next.add(n);
        }
        
        dfs(1, 0, next);
        
        return answer;
    }
    
    static void dfs(int sheep, int wolf, List<Integer> next) {
        answer = Math.max(answer, sheep);
        
        for (int i = 0; i < next.size(); i++) {
            int node = next.get(i);
            
            int newSheep = sheep;
            int newWolf = wolf;
            
            if (info[node] == 0) {
                newSheep++;
            } else {
                newWolf++;
            }
            
            if (newSheep <= newWolf) {
                continue;
            }
            
            List<Integer> newNext = new ArrayList<>(next);
            newNext.remove(i);
            
            for (int n : graph.get(node)) {
                newNext.add(n);
            }
            
            dfs(newSheep, newWolf, newNext);
        }
    }
}