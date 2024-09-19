import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Main {
    static int n, m;
    static int[][] map;
    static boolean[] visit;
    static List<int[]> home = new ArrayList<>();
    static List<int[]> chicken = new ArrayList<>();
    static List<int[]> select = new ArrayList<>();
    static int dist_min = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n][n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < n; j++) {
                int num = Integer.parseInt(st.nextToken());
                map[i][j] = num;
                if (num == 1) home.add(new int[]{i, j});
                else if (num == 2) chicken.add(new int[]{i, j});
            }
        }
        visit = new boolean[chicken.size()];

        back_track(0, 0);
        System.out.println(dist_min);
    }

    static void back_track(int idx, int cnt) {
        if (cnt == m) {
            int dist_sum = 0;
            for (int[] h : home) {
                int min = Integer.MAX_VALUE;
                for (int[] s : select) {
                    int dist = Math.abs(h[0]-s[0]) + Math.abs(h[1]-s[1]);
                    min = Math.min(dist, min);
                }
                dist_sum += min;
            }
            dist_min = Math.min(dist_sum, dist_min);
            return;
        }

        for (int i = idx; i < chicken.size(); i++) {
            if (!visit[i]) {
                visit[i] = true;
                select.add(chicken.get(i));
                back_track(i+1, cnt+1);
                select.remove(select.size()-1);
                visit[i] = false;
            }
        }
    }
}
