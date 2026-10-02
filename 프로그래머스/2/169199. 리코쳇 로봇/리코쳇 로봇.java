import java.util.*;

class Solution {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    public int solution(String[] board) {
        int n = board.length;
        int m = board[0].length();
        
        int sx = 0;
        int sy = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i].charAt(j) == 'R') {
                    sx = i;
                    sy = j;
                }
            }
        }
        
        boolean[][] visited = new boolean[n][m];
        Queue<int[]> que = new ArrayDeque<>();
        
        que.offer(new int[]{sx, sy, 0});
        visited[sx][sy] = true;
        
        while (!que.isEmpty()) {
            int[] cur = que.poll();
            int x = cur[0];
            int y = cur[1];
            int cnt = cur[2];
            
            if (board[x].charAt(y) == 'G') return cnt;
            
            for (int i = 0; i < 4; i++) {
                int nx = x;
                int ny = y;
                
                while (true) {
                    int nextX = nx+dx[i];
                    int nextY = ny+dy[i];
                    
                    if (nextX < 0 || nextX >= n || nextY < 0 || nextY >= m || board[nextX].charAt(nextY) == 'D') {
                        break;
                    }
                    
                    nx = nextX;
                    ny = nextY;
                }
                
                if (!visited[nx][ny]) {
                    visited[nx][ny] = true;
                    que.offer(new int[]{nx, ny, cnt+1});
                }
            }
        }
        
        return -1;
    }
}