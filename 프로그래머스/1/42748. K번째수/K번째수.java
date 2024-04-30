import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int idx = 0;
        for (int[] arr : commands) {
            int[] sub = Arrays.copyOfRange(array, arr[0]-1, arr[1]);
            Arrays.sort(sub);
            answer[idx++] = sub[arr[2]-1];
        }
        return answer;
    }
}