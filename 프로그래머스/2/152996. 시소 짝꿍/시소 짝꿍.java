import java.util.*;

class Solution {
    public long solution(int[] weights) {
        long answer = 0;
        int len = weights.length;
        Arrays.sort(weights);
        Map<Long, Long> cnt = new HashMap<>();
        
        for (long w : weights) {
            answer += cnt.getOrDefault(w, 0L);
            long num;
            
            num = w*2;
            if (num % 3 == 0) {
                answer += cnt.getOrDefault(num / 3, 0L);
            }
            
            if (w % 2 == 0) {
                answer += cnt.getOrDefault(w / 2, 0L);
            }
            
            num = w*3;
            if (num % 4 == 0) {
                answer += cnt.getOrDefault(num / 4, 0L);
            }
            
            cnt.put(w, cnt.getOrDefault(w, 0L)+1);
        }
        
        return answer;
    }
}