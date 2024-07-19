import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static String[][] graph;
    public static int[] dx = {-1, 0, 0, 1};
    public static int[] dy = {0, 1, -1, 0};
    public static int n;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        graph = new String[n][n];
        List<Integer> lst = new ArrayList<>();
        for (int t = 0; t < n; t++) {
            String input = br.readLine();
            for (int k = 0; k < n; k++) {
                graph[t][k] = String.valueOf(input.charAt(k));
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (graph[i][j].equals("1")) {
                    lst.add(bfs(i, j));
                }
            }
        }
        Collections.sort(lst);
        System.out.println(lst.size());
        for (int i = 0; i < lst.size(); i++) {
            System.out.println(lst.get(i));
        }
    }
    public static int bfs(int a, int b) {
        int cnt = 1;
        graph[a][b] = "0";
        Queue<int[]> que = new LinkedList<int[]>();
        que.add(new int[]{a, b});
        while (!que.isEmpty()) {
            int[] cur = que.poll();
            int x = cur[0];
            int y = cur[1];
            for (int i = 0; i < 4; i++) {
                int nx = x+dx[i];
                int ny = y+dy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < n && graph[nx][ny].equals("1")) {
                    graph[nx][ny] = "0";
                    cnt++;
                    que.add(new int[]{nx, ny});
                }
            }
        }
        return cnt;
    }
}
