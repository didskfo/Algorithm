import java.util.*;
class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> lst = new ArrayList<Integer>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                n = n / i;
                if (!lst.contains(i)) {
                    lst.add(i);
                }
            }
        }
        int[] answer = new int[lst.size()];
        for (int i = 0; i < lst.size(); i++) {
            answer[i] = lst.get(i);
        }
        return answer;
    }
}