import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    static int k;
    static int[] arr;
    static boolean[] visit;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        while (true) {
            st = new StringTokenizer(br.readLine(), " ");
            k = Integer.parseInt(st.nextToken());
            if (k == 0) break;
            arr = new int[k];
            visit = new boolean[k];
            for (int i = 0; i < k; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            combination(0, 0);
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }

    static void combination(int idx, int cnt) {
        if (cnt == 6) {
            for (int i = 0; i < k; i++) {
                if (visit[i]) sb.append(arr[i] + " ");
            }
            sb.append("\n");
            return;
        }

        for (int i = idx; i < k; i++) {
            if (!visit[i]) {
                visit[i] = true;
                combination(i+1, cnt+1);
                visit[i] = false;
            }
        }
    }
}
