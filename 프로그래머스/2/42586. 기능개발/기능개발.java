import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> arr = new ArrayList<>();
        int cnt;
        int length = progresses.length;
        
        while (length!=0) {
            for (int i = 0; i < length; i++) {
                progresses[i] += speeds[i];
            }
            cnt = 0;
            while (length!=0 && progresses[0] >= 100) {
                cnt += 1;
                progresses = Arrays.copyOfRange(progresses, 1, length);
                speeds = Arrays.copyOfRange(speeds, 1, length); 
                length -= 1;
            }
            if (cnt > 0) arr.add(cnt);
            
        }
        int[] answer = arr.stream()
                .mapToInt(Integer::intValue)
                .toArray();;
        return answer;
    }
}