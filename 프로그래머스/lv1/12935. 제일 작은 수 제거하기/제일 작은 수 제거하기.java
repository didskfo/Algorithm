import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1){
            int[] ans = {-1};
            return ans;
        }
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            min = Math.min(arr[i], min);
        }
        int idx = 0;
        int[] answer = new int[arr.length-1];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == min){
                continue;
            }else{
                answer[idx++] = arr[i];
            }
        }
        
        return answer;
    }
}