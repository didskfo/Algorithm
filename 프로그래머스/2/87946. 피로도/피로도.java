import java.util.*;

class Solution {
    static boolean[] visit;
    static int answer = 0;
    public int solution(int k, int[][] dungeons) {
        visit = new boolean[dungeons.length];
        dfs(k, 0, dungeons);
        return answer;
    }
    
    static void dfs(int tired, int cnt, int[][] dungeons) {
        for (int i = 0; i < dungeons.length; i++) {
            if (!visit[i] && dungeons[i][0] <= tired) {
                visit[i] = true;
                dfs(tired-dungeons[i][1], cnt+1, dungeons);
                visit[i] = false;
            }
        }
        answer = Math.max(answer, cnt);
    }
}