import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int answer = 0;
        int[] cur;
        int x, y, dx, dy, cnt;
        int[] nx = {-1, 0, 0, 1};
        int[] ny = {0, -1, 1, 0};
        Queue<int[]> que = new LinkedList<>();
        boolean[][] visited = new boolean[maps.length][maps[0].length];
        que.add(new int[]{0, 0, 1});
        visited[0][0] = true;
        
        while (!que.isEmpty()) {
            cur = que.poll();
            x = cur[0];
            y = cur[1];
            cnt = cur[2];
            
            if (x == maps.length-1 && y == maps[0].length-1) {
                return cnt;
            }
            
            for (int i = 0; i < 4; i++) {
                dx = x + nx[i];
                dy = y + ny[i];
                if (dx >= 0 && dx < maps.length && dy >= 0 && dy < maps[0].length && maps[dx][dy] == 1 && !visited[dx][dy]) {
                    que.add(new int[]{dx, dy, cnt+1});
                    visited[dx][dy] = true;
                }
            }
        }
        return -1;
    }
}