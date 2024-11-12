import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] len = new int[N-1];
        int[] price = new int[N];
        int total = 0;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N-1; i++) {
            len[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            price[i] = Integer.parseInt(st.nextToken());
        }
        int min = price[0];

        int cur = 0;
        while (cur < N-1) {
            if (price[cur] < min) {
                min = price[cur];
            }
            total += min*len[cur];
            cur++;
        }

        System.out.println(total);
    }
}
