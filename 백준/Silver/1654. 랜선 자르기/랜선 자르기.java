import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int K = Integer.parseInt(input[0]);
        int N = Integer.parseInt(input[1]);
        int[] lan = new int[K];
        long start = 1;
        long end = 0;
        long mid = 0;
        for (int k = 0; k < K; k++) {
            lan[k] = Integer.parseInt(br.readLine());
            end = Math.max(end, lan[k]);
        }

        while (start <= end) {
            mid = (start+end)/2;
            long cnt = 0;
            for (int i = 0; i < K; i++) {
                cnt += lan[i]/mid;
            }

            if (cnt >= N) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        System.out.println(end);
    }
}
