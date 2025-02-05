import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int day = 0; 
        int[] res = new int[100];
        for (int i = 0; i < progresses.length; i++) {
            while (progresses[i] + day*speeds[i] < 100) {
                day++;
            }
            res[day]++;
        }
        
        return Arrays.stream(res).filter(i -> i != 0).toArray();
    }
}