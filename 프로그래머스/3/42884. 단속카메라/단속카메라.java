import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        int answer = 0;
        Arrays.sort(routes, (r1, r2) -> r1[1] - r2[1]);
        int end = -30001;
        for (int[] route : routes) {
            if (end < route[0]) {
                end = route[1];
                answer++;
            }
        }
        return answer;
    }
}