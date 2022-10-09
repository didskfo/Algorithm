import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int count = 0;
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                count ++;
            }
        }
        if(count == 0){
            int[] answer = {-1};
            return answer;
        }
        int[] answer = new int[count];
        int number = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                answer[number] = arr[i];
                number ++;
            }
        }
        return answer;
    }
}