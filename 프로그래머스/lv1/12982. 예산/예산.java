import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        int sum = 0;
        int idx = 0;
        while (sum <= budget && idx < d.length) {
            sum += d[idx];
            idx++;
        }
        if (sum > budget) {
            idx--;
        }
        answer = idx;
        return answer;
    }
}