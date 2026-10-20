import java.util.*;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        int n = order.length;
        Stack<Integer> st = new Stack<>();
        
        int idx = 0;
        for (int i = 1; i <= n; i++) {
            if (order[idx] == i) {
                answer++;
                idx++;
                while (!st.isEmpty() && st.peek() == order[idx]) {
                    st.pop();
                    answer++;
                    idx++;
                }
            } else {
                st.push(i);
            }
        }
        return answer;
    }
}