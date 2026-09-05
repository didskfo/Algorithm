import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] res = new int[100];
        int day = 1;
        for (int i = 0; i < progresses.length; i++) {
            while (progresses[i] + speeds[i]*day < 100) {
                day++;
            }
            res[day]++;
        }
        return Arrays.stream(res).filter(i -> i != 0).toArray();
    }
}