import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Set;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st;
            HashMap<String, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                String name = st.nextToken();
                String category = st.nextToken();
                if (map.containsKey(category)) {
                    map.put(category, map.get(category)+1);
                } else {
                    map.put(category, 1);
                }
            }
            if (map.size() == 1) System.out.println(n);
            else {
                int ans = 1;
                Set<String> key = map.keySet();
                for (String k : key) {
                    int cnt = map.get(k);
                    ans *= cnt+1;
                }
                System.out.println(ans-1);
            }
        }
    }
}
