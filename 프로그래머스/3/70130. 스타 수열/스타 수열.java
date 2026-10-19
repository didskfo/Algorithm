import java.util.*;

class Solution {
    public int solution(int[] a) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : a) {
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        
        for (int key : map.keySet()) {
            int n = map.get(key);
            if (n*2 <= answer) continue;
            
            int pair = 0;
            for (int i = 0; i < a.length-1;) {
                if (a[i] != a[i+1] && (a[i] == key || a[i+1] == key)) {
                    pair++;
                    i+=2;
                } else {
                    i++;
                }
            }
            answer = Math.max(answer, pair*2);
        }
        return answer;
    }
}