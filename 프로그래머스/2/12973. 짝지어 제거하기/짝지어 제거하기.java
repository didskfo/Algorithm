import java.util.*;

class Solution
{
    public int solution(String s)
    {
        Stack<Character> st = new Stack<>();
        char[] arr = s.toCharArray();
        for (char a : arr) {
            if (st.isEmpty()) {
                st.push(a);
            } else {
                if (st.peek() == a) {
                    st.pop();
                } else {
                    st.push(a);
                }
            }
        }
        if (st.isEmpty()) return 1;
        return 0;
    }
}