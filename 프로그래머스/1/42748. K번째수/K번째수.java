import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int t = 0; t < commands.length; t++) {
            int i = commands[t][0];
            int j = commands[t][1];
            int k = commands[t][2];
            int[] res = new int[j-i+1];
            int idx = 0;
            for (int s = i-1; s < j; s++) {
                res[idx++] = array[s];
            }
            Arrays.sort(res);
            answer[t] = res[k-1];
        }
        return answer;
    }
}