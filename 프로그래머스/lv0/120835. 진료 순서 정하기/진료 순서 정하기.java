import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        int[] arr = new int[emergency.length];
        for (int i = 0; i < emergency.length; i++) {
            arr[i] = emergency[i];
        }
        Arrays.sort(arr);
        int[] answer = new int[arr.length];
        int idx = 0;
        for (int i = 0; i < emergency.length; i++) {
            for (int j = arr.length-1; j >= 0; j--) {
                if (emergency[i] == arr[j]) {
                    answer[i] = emergency.length-j;
                }
            }
        }
        return answer;
    }
}