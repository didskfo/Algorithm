import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int idx = 0;
        for(int t = 0; t < commands.length; t++){
            
            int start = commands[t][0];
            int end = commands[t][1];
            int target = commands[t][2];
            int[] n_array = new int[end - start + 1];
            int idx_ = 0;
            for(int i = start-1; i < end; i++){
                n_array[idx_] = array[i];
                idx_++;
            }
            Arrays.sort(n_array);
            answer[idx] = n_array[target-1];
            idx++;
            
        }
        return answer;
    }
}