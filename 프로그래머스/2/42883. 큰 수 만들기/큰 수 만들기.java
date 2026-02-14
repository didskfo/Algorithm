import java.util.*; 
class Solution { 
    public String solution(String number, int k) { 
        int n = number.length() - k; 
        Stack<Character> st = new Stack<>(); 
        for (char a : number.toCharArray()) { 
            while (!st.isEmpty() && k > 0 && st.peek() < a) { 
                st.pop(); 
                k--; 
            } 
            st.push(a); 
        } 
        StringBuilder sb = new StringBuilder(); 
        for (int i = 0; i < n; i++) { 
            sb.append(st.get(i)); 
        } 
        return sb.toString(); 
    }
}