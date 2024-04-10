import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        for (String[] a : clothes) {
            hm.put(a[1], hm.getOrDefault(a[1], 0)+1);
        }
        for (String key: hm.keySet()) {
			int value = hm.get(key);
            answer *= value+1;
		}
        return answer-1;
    }
}