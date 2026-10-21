import java.util.*;

class Solution {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    
    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        int answer = 0;
        int[][] board = new int[102][102];
        
        for (int[] r : rectangle) {
            int x1 = r[0]*2;
            int y1 = r[1]*2;
            int x2 = r[2]*2;
            int y2 = r[3]*2;
            
            for (int x = x1; x <= x2; x++) {
                for (int y = y1; y <= y2; y++) {
                    if (x > x1 && x < x2 && y > y1 && y < y2) {
                        board[x][y] = 2;
                    } else {
                        if (board[x][y] != 2) {
                            board[x][y] = 1;
                        }
                    }
                }
            }
        }
        
        int startX = characterX * 2;
        int startY = characterY * 2;
        int targetX = itemX * 2;
        int targetY = itemY * 2;

        Queue<int[]> que = new ArrayDeque<>();
        boolean[][] visit = new boolean[102][102];
        
        que.offer(new int[]{startX, startY, 0});
        visit[startX][startY] = true;
        
        while (!que.isEmpty()) {
            int[] cur = que.poll();
            
            int x = cur[0];
            int y = cur[1];
            int dist = cur[2];
            
            if (x == targetX && y == targetY) return dist/2;
            
            for (int i = 0; i < 4; i++) {
                int nx = x+dx[i];
                int ny = y+dy[i];
                
                if (nx >= 0 && nx < 102 && ny >= 0 && ny < 102 && !visit[nx][ny] && board[nx][ny] == 1) {
                    visit[nx][ny] = true;
                    que.offer(new int[]{nx, ny, dist+1});
                }
            }
        }
        return answer;
    }
}