import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> hm1 = new HashMap<String, Integer>();
        HashMap<String, Integer> hm2 = new HashMap<String, Integer>();
        for (String a : participant) {
            hm1.put(a, hm1.getOrDefault(a, 0)+1);
        }
        for (String b : completion) {
            hm2.put(b, hm2.getOrDefault(b, 0)+1);
        }
        for (String key: hm1.keySet()) {
			int value1 = hm1.get(key);
            int value2 = hm2.getOrDefault(key, 0);
            if (value2 == 0) return key;
			if (value1 != value2) return key;	
		}
        return "";
    }
}