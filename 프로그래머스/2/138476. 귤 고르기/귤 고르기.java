import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < tangerine.length; i++) {
            count.put(tangerine[i], count.getOrDefault(tangerine[i], 0)+1);
        }
        
        ArrayList<Integer> value = new ArrayList<>(count.values());
        Collections.sort(value, Collections.reverseOrder());
        
        int idx = 0;
        while (k > 0) {
            k -= value.get(idx++);
            answer++;
        }
        return answer;
    }
}