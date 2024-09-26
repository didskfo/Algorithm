import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    static int N;
    static int[][] paper;
    static int white = 0;
    static int blue = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        paper = new int[N][N];
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        cut(0, 0, N);
        System.out.println(white);
        System.out.println(blue);
    }

    static void cut(int x, int y, int n) {
        int color = paper[x][y];
        for (int i = x; i < x+n; i++) {
            for (int j = y; j < y+n; j++) {
                if (paper[i][j] != color) {
                    cut(x, y, n/2);
                    cut(x, y+n/2, n/2);
                    cut(x+n/2, y, n/2);
                    cut(x+n/2, y+n/2, n/2);
                    return;
                }
            }
        }
        if (color == 0) white++;
        else blue++;
    }
}
