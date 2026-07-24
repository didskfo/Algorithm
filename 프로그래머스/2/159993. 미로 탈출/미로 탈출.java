import java.util.*;

class Solution {
    static int[] dx = {-1, 0, 0, 1};
    static int[] dy = {0, -1, 1, 0};
    
    public int solution(String[] maps) {
        int answer = 0;
        int n = maps.length;
        int m = maps[0].length();
        char[][] map = new char[n][m];
        int startX = 0, startY = 0, leverX = 0, leverY = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = maps[i].charAt(j);
                if (map[i][j] == 'S') {
                    startX = i;
                    startY = j;
                }
                if (map[i][j] == 'L') {
                    leverX = i;
                    leverY = j;
                }
            }
        }
        
        int startToLever = bfs(map, startX, startY, 'L');
        if (startToLever == -1) return -1;
        
        int leverToEnter = bfs(map, leverX, leverY, 'E');
        if (leverToEnter == -1) return -1;
        
        return startToLever + leverToEnter;
    }
    
    static int bfs(char[][] map, int startX, int startY, char target) {
        int n = map.length;
        int m = map[0].length;
        
        boolean[][] visited = new boolean[n][m];
        Queue<int[]> que = new LinkedList<>();
        
        que.offer(new int[]{startX, startY, 0});
        visited[startX][startY] = true;
        
        while (!que.isEmpty()) {
            int[] cur = que.poll();
            int x = cur[0];
            int y = cur[1];
            int dist = cur[2];
            
            if (map[x][y] == target) {
                return dist;
            }
            
            for (int i = 0; i < 4; i++) {
                int nx = x+dx[i];
                int ny = y+dy[i];
                if (nx<0 || nx>=n || ny<0 || ny>=m) continue;
                if (map[nx][ny] == 'X') continue;
                if (visited[nx][ny]) continue;
                
                visited[nx][ny] = true;
                que.offer(new int[]{nx, ny, dist+1});
            }
        }
        
        return -1;
    }
}