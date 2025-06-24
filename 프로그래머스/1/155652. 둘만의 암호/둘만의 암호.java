import java.util.*;
class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        char[] alpha = new char[26-skip.length()];
        char a = 'a';
        for (int i = 0; i < alpha.length; i++) {
            while (skip.contains(String.valueOf(a))) {
                a++;
            }
            alpha[i] = a;
            a++;
        }
        
        String str = new String(alpha);
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            int idx = str.indexOf(cur);
            answer += alpha[(idx+index)%alpha.length];
        }
        return answer;
    }
}