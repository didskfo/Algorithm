import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        for (int i = 0; i <= discount.length-10; i++) {
            int[] num = number.clone();
            boolean check = true;
            for (int j = 0; j < 10; j++) {
                int idx = Arrays.asList(want).indexOf(discount[i+j]);
                if (idx != -1) num[idx]--;
            }
            for (int n : num) {
                if (n != 0) {
                    check = false;
                }
            }
            if (check) answer++;
        }
        return answer;
    }
}