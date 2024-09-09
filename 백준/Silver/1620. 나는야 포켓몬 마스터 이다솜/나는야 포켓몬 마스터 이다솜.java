import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Map<Integer, String> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        for (int i = 1; i < n+1; i++) {
            String name = br.readLine();
            map1.put(i, name);
            map2.put(name, i);
        }
        for (int i = 0; i < m; i++) {
            String input = br.readLine();
            if (Character.isDigit(input.charAt(0))) {
                System.out.println(map1.get(Integer.parseInt(input)));
            } else {
                System.out.println(map2.get(input));
            }
        }
    }
}
