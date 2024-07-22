import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static String[] black = {
        "BWBWBWBW",
        "WBWBWBWB",
        "BWBWBWBW",
        "WBWBWBWB",
        "BWBWBWBW",
        "WBWBWBWB",
        "BWBWBWBW",
        "WBWBWBWB",
    };
    public static String[] white = {
        "WBWBWBWB",
        "BWBWBWBW",
        "WBWBWBWB",
        "BWBWBWBW",
        "WBWBWBWB",
        "BWBWBWBW",
        "WBWBWBWB",
        "BWBWBWBW",
    };
    public static String[] graph;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        graph = new String[n];
        int min = 64;
        for (int i = 0; i < n; i++) {
            graph[i] = br.readLine();
        }
        for (int i = 0; i < n-7; i++) {
            for (int j = 0; j < m-7; j++) {
                int cnt = count(i, j);
                min = Math.min(cnt, min);
            }
        }
        System.out.println(min);
    }
    public static int count(int x, int y) {
        int cnt_b = 0;
        int cnt_w = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (black[i].charAt(j) != graph[i+x].charAt(j+y)) {
                    cnt_b++;
                }
                if (white[i].charAt(j) != graph[i+x].charAt(j+y)) {
                    cnt_w++;
                }
            }
        }
        return Math.min(cnt_w, cnt_b);
    }
}
