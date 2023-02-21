import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Integer[] score_sort = new Integer[score.length];
        for (int i = 0; i < score.length; i++) {
            score_sort[i] = score[i];
        }
        Arrays.sort(score_sort, Collections.reverseOrder());
        int[] arr = new int[m];
        for (int i = 0; i < score.length/m; i++) {
            for (int j = 0; j < m; j++) {
                arr[j] = score_sort[i*m+j];
            }
            answer += arr[m-1] * m;
        }
        return answer;
    }
}