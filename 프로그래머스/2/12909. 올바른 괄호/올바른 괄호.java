import java.util.Stack;

class Solution {
    boolean solution(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> st = new Stack<>();
        for (char a : arr) {
            if (a == '(') st.push('(');
            else {
                if (st.isEmpty()) return false;
                st.pop();
            }
        }
        if (!st.isEmpty()) return false;
        return true;
    }
}