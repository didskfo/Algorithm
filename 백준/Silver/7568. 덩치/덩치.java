import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] peo = new int[n][];
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            peo[i] = new int[]{Integer.parseInt(input[0]), Integer.parseInt(input[1]), i};
        }

        for (int i = 0; i < n; i++) {
            int cnt = 1;
            for (int j = 0; j < n; j++) {
                if (peo[i][0] < peo[j][0] && peo[i][1] < peo[j][1]) cnt++;
            }
            System.out.print(cnt + " ");
        }
    }
}
