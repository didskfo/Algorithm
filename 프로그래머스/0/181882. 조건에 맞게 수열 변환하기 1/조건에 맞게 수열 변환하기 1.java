import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i : arr) {
            if (i >= 50 && i % 2 == 0) {
                answer.add(i/2);
            } else if (i < 50 && i % 2 != 0) {
                answer.add(i*2);
            } else {
                answer.add(i);
            }
        }
        return answer;
    }
}