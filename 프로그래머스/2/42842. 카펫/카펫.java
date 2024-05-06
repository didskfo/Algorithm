import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        if (yellow == 1) {
            answer[0] = 3;
            answer[1] = 3;
            return answer;
        }
        List<List<Integer>> arr = new ArrayList<>();
        for (int i = 1; i <= yellow/2; i++) {
            List<Integer> lst = new ArrayList<>();
            if (yellow%i == 0 && ((yellow/i+2)*(i+2) == brown+yellow)) {
                if (yellow/i-i >= 0) {
                    lst.add(yellow/i-i);
                    lst.add(yellow/i);
                    lst.add(i);
                    arr.add(lst);
                }
            }
        }
        
        Collections.sort(arr, (a, b) -> {
            return a.get(0).compareTo(b.get(0));
        });
                
        List<Integer> ans = arr.get(0);
        answer[0] = ans.get(1)+2;
        answer[1] = ans.get(2)+2;
        return answer;
    }
}