import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = i+1;
        }
        boolean[] visit = new boolean[n];
        combination(num, visit, 0, 0, n, m);
    }

    public static void combination(int[] arr, boolean[] visit, int start, int depth, int n, int m) {
        if (depth == m) {
            for (int i = 0; i < n; i++) {
                if (visit[i]) System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }
        for (int i = start; i < n; i++) {
            if (!visit[i]) {
                visit[i] = true;
                combination(arr, visit, i+1, depth+1, n, m);
                visit[i] = false;
            }
        }
    }
}
