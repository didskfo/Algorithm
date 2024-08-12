import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split("-");
        List<Integer> lst = new ArrayList<>();
        for (String str : input) {
            String[] num = str.split("\\+");
            int sum = 0;
            for (String a : num) {
                sum += Integer.parseInt(a);
            }
            lst.add(sum);
        }

        int ans = lst.get(0);
        for (int i = 1; i < lst.size(); i++) {
            ans -= lst.get(i);
        }
        System.out.println(ans);
    }
}
