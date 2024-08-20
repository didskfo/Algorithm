import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
    static int n;
    static int[][] arr;
    static int cnt = 0;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        for (int[] row : arr) {
            Arrays.fill(row, 0);
        }
        nQueen(0);
        System.out.println(cnt);
    }

    static void nQueen(int depth) {
        if (depth == n) {
            cnt++;
        }

        for (int i = 0; i < n; i++) {
            if (isPossible(depth, i)) {
                arr[depth][i] = 1;
                nQueen(depth+1);
                arr[depth][i] = 0;
            }
        }
    }

    static boolean isPossible(int row, int col) {
        for (int i = 0; i < row; i++) {
            if (arr[i][col] == 1) return false;
        }

        int i = row; 
        int j = col;
        while (i >= 0 && j >= 0) {
            if (arr[i][j] == 1) return false;
            i--;
            j--;
        }

        i = row; 
        j = col;
        while (i >= 0 && j < n) {
            if (arr[i][j] == 1) return false;
            i--;
            j++;
        }

        return true;
    }
}
