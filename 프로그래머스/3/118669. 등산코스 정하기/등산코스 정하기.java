import java.util.*;

class Solution {
    static class Edge {
        int to;
        int weight;
        
        Edge(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }
    
    public int[] solution(int n, int[][] paths, int[] gates, int[] summits) {
        List<Edge>[] graph = new ArrayList[n+1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        
        for (int[] path : paths) {
            int a = path[0];
            int b = path[1];
            int w = path[2];

            graph[a].add(new Edge(b, w));
            graph[b].add(new Edge(a, w));
        }
        
        boolean[] isSummit = new boolean[n+1];
        for (int summit : summits) {
            isSummit[summit] = true;
        }
        
        int[] intensity = new int[n + 1];
        Arrays.fill(intensity, Integer.MAX_VALUE);
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        for (int gate : gates) {
            intensity[gate] = 0;
            pq.offer(new int[]{gate, 0});
        }
        
        while (!pq.isEmpty()) {

            int[] cur = pq.poll();

            int node = cur[0];
            int cost = cur[1];

            if (cost > intensity[node]) {
                continue;
            }

            if (isSummit[node]) {
                continue;
            }

            for (Edge edge : graph[node]) {

                int next = edge.to;

                int nextIntensity = Math.max(cost, edge.weight);

                if (nextIntensity < intensity[next]) {

                    intensity[next] = nextIntensity;

                    pq.offer(new int[]{next, nextIntensity});
                }
            }
        }
        
        Arrays.sort(summits);
        
        int answerSummit = 0;
        int answerIntensity = Integer.MAX_VALUE;

        for (int summit : summits) {

            if (intensity[summit] < answerIntensity) {
                answerIntensity = intensity[summit];
                answerSummit = summit;
            }
        }

        return new int[]{answerSummit, answerIntensity};
    }
}