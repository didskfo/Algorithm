import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] n_arr = br.readLine().split(" ");
        int m = Integer.parseInt(br.readLine());
        String[] m_arr = br.readLine().split(" ");
        HashSet<String> set = new HashSet<>(Arrays.asList(n_arr));
        for (String a : m_arr) {
            if (set.contains(a)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
