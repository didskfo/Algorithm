import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int day = 1;
        int n = progresses.length;
        int[] res = new int[100];
        
        for (int i = 0; i < n; i++) {
            while (progresses[i] + speeds[i]*day < 100) {
                day++;
            }
            res[day]++;
        }
        return Arrays.stream(res).filter(i -> i != 0).toArray();
    }
}