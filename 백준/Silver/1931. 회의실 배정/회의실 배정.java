import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] lst = new int[n][];
        int cnt = 1;
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            lst[i] = new int[]{Integer.parseInt(input[0]), Integer.parseInt(input[1])};
        }
        Arrays.sort(lst, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[]o2) {
                return o1[1] != o2[1] ? o1[1] - o2[1] : o1[0] - o2[0];
            }
        });
        int[] cur = lst[0];
        for (int i = 1; i < n; i++) {
            if (cur[1] <= lst[i][0]) {
                cnt++;
                cur = lst[i];
            }
        }
        System.out.println(cnt);
    }
}
