import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    static int[][] map;
    static int N;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = input.charAt(j) - '0';
            }
        }

        QuadTree(0, 0, N);
        System.out.println(sb.toString());
    }

    static void QuadTree(int x, int y, int size) {
        if (isPossible(x, y, size)) {
            sb.append(map[x][y]);
            return;
        }

        sb.append('(');
        QuadTree(x, y, size/2);
        QuadTree(x, y+size/2, size/2);
        QuadTree(x+size/2, y, size/2);
        QuadTree(x+size/2, y+size/2, size/2);
        sb.append(')');
    }

    static boolean isPossible(int x, int y, int size) {
        int check = map[x][y];
        for (int i = x; i < x+size; i++) {
            for (int j = y; j < y+size; j++) {
                if (map[i][j] != check) return false;
            }
        }
        return true;
    }
}
