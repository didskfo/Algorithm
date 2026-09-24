import java.util.*;

class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int n = board.length;
        int INF = Integer.MAX_VALUE;
        
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        
        int[][][] dist = new int[n][n][4];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Arrays.fill(dist[i][j], INF);
            }
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(a[0], b[0])
        );
        
        pq.offer(new int[]{0, 0, 0, -1});
        
        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int cost = cur[0];
            int x = cur[1];
            int y = cur[2];
            int dir = cur[3];
            
            if (dir != -1 && cost > dist[x][y][dir]) {
                continue;
            }
            
            if (x == n-1 && y == n-1) {
                return cost;
            }
            
            for (int i = 0; i < 4; i++) {
                int nx = x+dx[i];
                int ny = y+dy[i];
                if (nx < 0 || nx >= n || ny < 0 || ny >= n) {
                    continue;
                }
                
                if (board[nx][ny] == 1) {
                    continue;
                }
                
                int next = cost + 100;
                if (dir != -1 && dir != i) {
                    next += 500;
                }
                
                if (next < dist[nx][ny][i]) {
                    dist[nx][ny][i] = next;
                    pq.offer(new int[]{next, nx, ny, i});
                }
            }
        }
        return answer;
    }
}