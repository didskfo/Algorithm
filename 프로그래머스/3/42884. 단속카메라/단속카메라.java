import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        int answer = 0;
        Arrays.sort(routes, (r1, r2) -> Integer.compare(r1[1], r2[1]));
        int end = Integer.MIN_VALUE;
        for (int[] route : routes) {
            if (end < route[0]) {
                answer++;
                end = route[1];
            }
        }
        return answer;
    }
}