import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] graph = new int[100][100];
        
        for (int n = 0; n < N; n++) {
            String[] input = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    graph[x+i-1][y+j-1] = 1;
                }
            }
        }

        int ans = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (graph[i][j] == 1) {
                    ans++;
                }
            }
        }

        System.out.println(ans);
    }
}
