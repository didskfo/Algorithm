import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int min = score[0];
        ArrayList<Integer> arr = new ArrayList<Integer>();
        if (k >= score.length) {
            for (int i = 0; i < score.length; i++) {
            if (min > score[i]) {
                min = score[i];
            }
            answer[i] = min;
        }
        } else {
        for (int i = 0; i < k; i++) {
            if (min > score[i]) {
                min = score[i];
            }
            answer[i] = min;
            arr.add(score[i]);
        }
        
        for (int i = k; i < score.length; i++) {
            arr.add(score[i]);
            Collections.sort(arr);
            answer[i] = arr.get(i-k+1);
        }
        }
        return answer;
    }
}