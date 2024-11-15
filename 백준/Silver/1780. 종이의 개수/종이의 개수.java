import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    static int N;
    static int[][] paper;
    static int a = 0;
    static int b = 0;
    static int c = 0;
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
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    static void cut(int x, int y, int n) {
        int num = paper[x][y];
        for (int i = x; i < x+n; i++) {
            for (int j = y; j < y+n; j++) {
                if (paper[i][j] != num) {
                    cut(x, y, n/3);
                    cut(x+n/3, y, n/3);
                    cut(x, y+n/3, n/3);
                    cut(x+n/3, y+n/3, n/3);
                    cut(x+n/3*2, y, n/3);
                    cut(x, y+n/3*2, n/3);
                    cut(x+n/3*2, y+n/3*2, n/3);
                    cut(x+n/3, y+n/3*2, n/3);
                    cut(x+n/3*2, y+n/3, n/3);
                    return;
                }
            }
        }
        if (num == -1) a++;
        else if (num == 0) b++;
        else c++;
    }
}
