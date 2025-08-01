import java.util.*;
class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        HashMap<Integer, Integer> right = new HashMap<>();
        for (int t : topping) {
            right.put(t, right.getOrDefault(t, 0)+1);
        }
        int rightCnt = right.size();
        Set<Integer> left = new HashSet<>();
        int leftCnt = 0;
        
        for (int i = 0; i < topping.length-1; i++) {
            int t = topping[i];
            int c = right.get(t);
            if (c == 1) {
                right.remove(t);
                rightCnt--;
            } else {
                right.put(t, c-1);
            }
            
            if (left.add(t)) {
                leftCnt++;
            }
            
            if (rightCnt == leftCnt) answer++;
            else if (rightCnt < leftCnt) break;
        }
        return answer;
    }
}