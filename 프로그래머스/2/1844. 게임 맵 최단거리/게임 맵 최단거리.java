import java.util.*;

class Solution {
    static int[] dx = {-1, 0, 0, 1};
    static int[] dy = {0, -1, 1, 0};
    static boolean[][] visited;
    public int solution(int[][] maps) {
        int answer = bfs(maps);
        return answer;
    }
    
    static int bfs(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        visited = new boolean[n][m];
        Queue<int[]> que = new ArrayDeque<>();
        que.offer(new int[]{0, 0, 1});
        while (!que.isEmpty()) {
            int[] cur = que.poll();
            int x = cur[0];
            int y = cur[1];
            int cnt = cur[2];
            if (x == n-1 && y == m-1) {
                return cnt;
            }
            
            for (int i = 0; i < 4; i++) {
                int nx = x+dx[i];
                int ny = y+dy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < m && maps[nx][ny] != 0 && !visited[nx][ny]) {
                    que.offer(new int[]{nx, ny, cnt+1});
                    visited[nx][ny] = true;
                }
            }
        }
        return -1;
    }
}