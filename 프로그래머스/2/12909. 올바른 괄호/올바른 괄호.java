import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        Stack<Character> st = new Stack<>();
        char[] sArr = s.toCharArray();
        
        for (char a : sArr) {
            if (a == '(') {
                st.push(a);
            } else {
                if (st.empty()) return false;
                st.pop();
            }
        }
        
        if (!st.empty()) return false;

        return answer;
    }
}