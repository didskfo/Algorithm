import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                ans.add(i);
            }
        }
        int[] answer = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++){
            answer[i] = ans.get(i);
        }
        return answer;
    }
}