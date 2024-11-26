import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            if (input[1].equals("enter")) {
                map.put(input[0], 1);
            } else {
                map.remove(input[0]);
            }
        }
        StringBuilder sb = new StringBuilder();
        List<String> keySet = new ArrayList<>(map.keySet());
        Collections.sort(keySet);
        Collections.reverse(keySet);
        for (String key : keySet) {
            sb.append(key + "\n");
        }
        System.out.println(sb.toString());
    }
}
