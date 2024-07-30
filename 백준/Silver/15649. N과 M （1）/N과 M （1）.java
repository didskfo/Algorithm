import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static int n, m;
    public static int[] selected;
    public static boolean[] visit;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        n = Integer.parseInt(input[0]);
        m = Integer.parseInt(input[1]);

        selected = new int[m];
        visit = new boolean[n+1];

        permutation(0);
    }

    public static void permutation(int depth) {
        if (depth == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(selected[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (!visit[i]) {
                selected[depth] = i;
                visit[i] = true;
                permutation(depth + 1);
                visit[i] = false;
            }
        }
    }
}
