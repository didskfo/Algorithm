import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr.length > 1) {
                if (i == 0) {
                    if (arr[i] != arr[i+1]) {
                        answer += arr[i];
                    }
                } else if (i == arr.length-1) {
                    if (arr[i] != arr[i-1]) {
                        answer += arr[i];
                    }
                } else {
                    if ((arr[i] != arr[i-1]) && (arr[i] != arr[i+1])) {
                        answer += arr[i];
                    }
                }
            } else {
                answer += arr[0];
            }
            
        }
        return answer;
    }
}