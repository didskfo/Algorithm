import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n];
        double sum = 0;
        int min = 4000;
        int max = -4000;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(br.readLine());
            num[i] = a;
            sum += a;
            map.put(a, map.getOrDefault(a, 0)+1);
            min = Math.min(min, a);
            max = Math.max(max, a);
        }
        Arrays.sort(num);
        List<Integer> keySet = new ArrayList<>(map.keySet());
        keySet.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));
        List<Integer> lst = new ArrayList<>();
        int high = map.get(keySet.get(0));
        for (Integer key : keySet) {
            if (map.get(key) == high) lst.add(key);
        }
        Collections.sort(lst);

        System.out.println(Math.round(sum/n));      // 산술평균
        System.out.println(num[n/2]);   // 중앙값
        if (lst.size() == 1) System.out.println(lst.get(0));    // 최빈값
        else System.out.println(lst.get(1));                    // 최빈값
        System.out.println(max - min);  // 범위
    }
}
