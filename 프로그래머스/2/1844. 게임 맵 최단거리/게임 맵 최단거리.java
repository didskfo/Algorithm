import java.util.*;

class Solution {
    static class Point {
        int x;
        int y;
        int cnt;

        public Point(int x, int y, int cnt) {
            this.x = x;
            this.y = y;
            this.cnt = cnt;
        }
    }

    public int solution(int[][] maps) {
        int[] nx = {-1, 0, 0, 1};
        int[] ny = {0, -1, 1, 0};

        Queue<Point> queue = new LinkedList<>();
        boolean[][][] visited = new boolean[maps.length][maps[0].length][2];
        queue.offer(new Point(0, 0, 1));
        visited[0][0][0] = true;

        while (!queue.isEmpty()) {
            Point cur = queue.poll();
            int x = cur.x;
            int y = cur.y;
            int cnt = cur.cnt;

            if (x == maps.length - 1 && y == maps[0].length - 1) {
                return cnt;
            }

            for (int i = 0; i < 4; i++) {
                int dx = x + nx[i];
                int dy = y + ny[i];

                if (dx >= 0 && dx < maps.length && dy >= 0 && dy < maps[0].length && maps[dx][dy] == 1 && !visited[dx][dy][0]) {
                    queue.offer(new Point(dx, dy, cnt + 1));
                    visited[dx][dy][0] = true;
                }
            }
        }
        return -1;
    }
}
