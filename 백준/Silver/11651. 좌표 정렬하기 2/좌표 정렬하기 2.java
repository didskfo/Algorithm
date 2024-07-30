import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] spot = new int[n][];
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            spot[i] = new int[]{Integer.parseInt(input[0]), Integer.parseInt(input[1])};
        }
        Arrays.sort(spot, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] != o2[1] ? o1[1] - o2[1] : o1[0] - o2[0];
            }
        });
        
        for (int[] s : spot) {
            System.out.println(s[0] + " " + s[1]);
        }
    }
}
