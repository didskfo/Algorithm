class Solution {
    static int answer = 0;
    static int[] extend;
    static int len;
    public int solution(int n, int[] weak, int[] dist) {
        len = weak.length;
        answer = dist.length+1;
        extend = new int[2*len];
        for (int i = 0; i < len; i++) {
            extend[i] = weak[i];
            extend[i+len] = weak[i]+n;
        }
        
        boolean[] visit = new boolean[dist.length];
        int[] order = new int[dist.length];
        
        permutation(0, dist, visit, order);
        return answer == dist.length+1 ? -1 : answer;
    }
    
    static void permutation(int depth, int[] dist, boolean[] visit, int[] order) {
        if (depth == dist.length) {
            check(order);
            return;
        }
        
        for (int i = 0; i < dist.length; i++) {
            if (visit[i]) continue;
            
            visit[i] = true;
            order[depth] = dist[i];
            
            permutation(depth+1, dist, visit, order);
            
            visit[i] = false;
        }
    }
    
    static void check(int[] order) {
        for (int start = 0; start < len; start++) {
            int cnt = 1;
            int pos = extend[start]+order[0];
            
            for (int i = start; i < start+len; i++) {
                if (extend[i] > pos) {
                    cnt++;
                    
                    if (cnt > order.length) {
                        break;
                    }
                    
                    pos = extend[i]+order[cnt-1];
                }
            }
            
            answer = Math.min(answer, cnt);
        }
    }
}