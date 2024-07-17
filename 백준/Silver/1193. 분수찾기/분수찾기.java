import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int cur_cnt = 1;
        int prev_cnt = 0;

        while (true) {
            if (x <= cur_cnt + prev_cnt) {
                if (cur_cnt % 2 == 1) {
                    System.out.println(cur_cnt-(x-prev_cnt-1) + "/" + (x-prev_cnt));
                    break;
                } else {
                    System.out.println((x-prev_cnt) + "/" + (cur_cnt-(x-prev_cnt-1)));
                    break;
                }
            } else {
                prev_cnt += cur_cnt;
                cur_cnt++;
            }
        }
    }
}
