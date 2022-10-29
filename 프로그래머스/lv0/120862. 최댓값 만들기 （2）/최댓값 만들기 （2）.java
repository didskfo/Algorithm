import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                arr.add(numbers[i]*numbers[j]);
            }
        }
        Collections.sort(arr);
        answer = arr.get(arr.size()-1);
        return answer;
    }
}