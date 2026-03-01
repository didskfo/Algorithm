import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split("-");
        int[] sum = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            int n = 0;
            if (input[i].contains("+")) {
                String[] num = input[i].split("\\+");
                for (int j = 0; j < num.length; j++) {
                    n += Integer.parseInt(num[j]);
                }
            } else {
                n = Integer.parseInt(input[i]);
            }
            sum[i] = n;
        }
        int answer = sum[0];
        for (int i = 1; i < sum.length; i++) {
            answer -= sum[i];
        }
        System.out.println(answer);
    }
}
