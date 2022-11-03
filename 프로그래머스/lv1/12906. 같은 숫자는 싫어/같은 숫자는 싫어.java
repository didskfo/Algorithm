import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> lst = new ArrayList<Integer>();
        lst.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i-1]) {
                lst.add(arr[i]);
            }
        }
        int[] answer = new int[lst.size()];
        for (int i = 0; i < lst.size(); i++) {
            answer[i] = lst.get(i);
        }
        
        
        return answer;
    }
}