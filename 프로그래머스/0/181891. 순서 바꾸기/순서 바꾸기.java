import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] subArr1 = Arrays.copyOfRange(num_list, 0, n);
        int[] subArr2 = Arrays.copyOfRange(num_list, n, num_list.length);
        int[] answer = new int[num_list.length];
        int idx = 0;
        for (int i : subArr2) {
            answer[idx++] = i;
        }
        for (int i : subArr1) {
            answer[idx++] = i;
        }
        return answer;
    }
}