import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int t : tangerine) {
            map.put(t, map.getOrDefault(t, 0)+1);
        }
        List<Integer> cnt = new ArrayList<>(map.values());
        Collections.sort(cnt, Collections.reverseOrder());
        
        for (int c : cnt) {
            answer++;
            k -= c;
            if (k <= 0) break;
        }
        return answer;
    }
}