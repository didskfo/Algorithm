import java.util.*;

class Solution {
    public String solution(String number, int k) {
        Stack<Character> st = new Stack<>();
        char[] arr = number.toCharArray();
        int end = arr.length - k;
        
        for (char a : arr) {
            while (!st.isEmpty() && k > 0 && st.peek() < a) {
                st.pop();
                k--;
            }
            st.push(a);
        }
        
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        
        return sb.reverse().substring(0, end);
    }
}