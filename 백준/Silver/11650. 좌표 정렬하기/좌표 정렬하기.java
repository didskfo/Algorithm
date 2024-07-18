import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];
        for (int t = 0; t < n; t++) {
            String[] input = br.readLine().split(" ");
            arr[t] = new int[]{Integer.parseInt(input[0]), Integer.parseInt(input[1])};
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[]o2) {
                return o1[0] != o2[0] ? o1[0] - o2[0] : o1[1] - o2[1];
            }
        });
        for (int[] a : arr) {
            System.out.println(a[0] + " " + a[1]);
        }
    }
}
