import java.util.*;

class Solution {
    public String solution(int age) {
        String answer = "";
        String str = Integer.toString(age);
        char[] arr = str.toCharArray();
        for (char a : arr) {
            char num = (char)(Character.getNumericValue(a) + 97);
            answer += num;
        }
        return answer;
    }
}