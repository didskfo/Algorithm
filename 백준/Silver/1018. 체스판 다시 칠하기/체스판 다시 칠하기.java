import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    static String[] black = {
        "BWBWBWBW",
        "WBWBWBWB",
        "BWBWBWBW",
        "WBWBWBWB",
        "BWBWBWBW",
        "WBWBWBWB",
        "BWBWBWBW",
        "WBWBWBWB"
    };
    static String[] white = {
        "WBWBWBWB",
        "BWBWBWBW",
        "WBWBWBWB",
        "BWBWBWBW",
        "WBWBWBWB",
        "BWBWBWBW",
        "WBWBWBWB",
        "BWBWBWBW"
    };
    static String[] input;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        input = new String[N];
        int min = 64;
        for (int i = 0; i < N; i++) {
            input[i] = br.readLine();
        }
        for (int i = 0; i < N-7; i++) {
            for (int j = 0; j < M-7; j++) {
                min = Math.min(count(i, j), min);
            }
        }
        System.out.println(min);
    }

    static int count(int x, int y) {
        int cnt_black = 0;
        int cnt_white = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (black[i].charAt(j) != input[x+i].charAt(y+j)) cnt_black++;
                if (white[i].charAt(j) != input[x+i].charAt(y+j)) cnt_white++;
            }
        }
        return Math.min(cnt_black, cnt_white);
    }
}
