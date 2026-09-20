import java.util.*;

class Solution {
    public String solution(String number, int k) {
        String answer = "";
        Stack<Character> st = new Stack<>();
        int len = number.length() - k;
        char[] num = number.toCharArray();
        
        for (char n : num) {
            while (!st.isEmpty() && k > 0 && st.peek() < n) {
                st.pop();
                k--;
            }
            st.push(n);
        }
        
        for (int i = 0; i < len; i++) {
            answer += st.get(i);
        }
        return answer;
    }
}