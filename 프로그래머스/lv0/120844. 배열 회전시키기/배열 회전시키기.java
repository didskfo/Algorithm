import java.util.*;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < numbers.length; i++) {
            arr.add(numbers[i]);
        }
        if (direction.equals("left")) {
            int a = numbers[0];
            arr.remove(0);
            arr.add(arr.size(), a);
        } else {
            int a = numbers[numbers.length-1];
            arr.remove(arr.size()-1);
            arr.add(0, a);
        }
        int[] answer = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            answer[i] = arr.get(i);
        }
        return answer;
    }
}