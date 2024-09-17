import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    static int n;
    static int[][] map;
    static boolean[] visit;
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        visit = new boolean[n];
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        combination(0, 0);
        System.out.println(min);
    }

    static void combination(int idx, int cnt) {
        if (cnt == n/2) {
            find_diff();
            return;
        }

        for (int i = idx; i < n; i++) {
            if (!visit[i]) {
                visit[i] = true;
                combination(i+1, cnt+1);
                visit[i] = false;
            }
        }
    }

    static void find_diff() {
        int start = 0; 
        int link = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if (visit[i] && visit[j]) {
                    start = start + map[i][j] + map[j][i];
                } else if (!visit[i] && !visit[j]) {
                    link = link + map[i][j] + map[j][i];
                }
            }
        }
        int diff = Math.abs(start - link);
        min = Math.min(diff, min);
        if (diff == 0) {
            System.out.println(0);
            System.exit(0);
        }
    }
}
