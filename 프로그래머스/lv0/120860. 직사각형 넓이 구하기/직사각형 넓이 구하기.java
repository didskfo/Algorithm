import java.util.*;
class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        Arrays.sort(dots, (o1, o2) -> {
            if(o1[0] == o2[0]) {
                return Integer.compare(o1[1], o2[1]);
            } else {
                return Integer.compare(o1[0], o2[0]);
            }
        });
        int v = Math.abs(dots[2][0] - dots[0][0]);
        int h = Math.abs(dots[1][1] - dots[0][1]);
        answer = v * h;
        return answer;
    }
}