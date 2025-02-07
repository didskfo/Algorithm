import java.util.*;

class Solution {
    static int[] dx = {-1, 0, 0, 1};
    static int[] dy = {0, -1, 1, 0};
    static boolean[][] visit;
    public int solution(int[][] maps) {
        visit = new boolean[maps.length][maps[0].length];
        return bfs(maps);
    }
    static int bfs(int[][] maps) {
        visit[0][0] = true;
        Queue<int[]> que = new LinkedList<>();
        que.add(new int[]{0, 0, 1});
        while (!que.isEmpty()) {
            int[] cur = que.poll();
            int x = cur[0];
            int y = cur[1];
            int cnt = cur[2];
            if (x == maps.length-1 && y == maps[0].length-1) {
                return cnt;
            }
            for (int i = 0; i < 4; i++) {
                int nx = x+dx[i];
                int ny = y+dy[i];
                if (nx>=0 && ny>=0 && nx<maps.length && ny<maps[0].length && maps[nx][ny]==1 && !visit[nx][ny]) {
                    visit[nx][ny] = true;
                    que.add(new int[]{nx, ny, cnt+1});
                }
            }
        }
        return -1;
    }
}