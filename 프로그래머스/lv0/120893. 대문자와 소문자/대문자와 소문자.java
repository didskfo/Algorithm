import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            char a = my_string.charAt(i);
            if (Character.isUpperCase(a)) {
                answer += my_string.valueOf(a).toLowerCase();
            } else {
                answer += my_string.valueOf(a).toUpperCase();
            }
        }
        return answer;
    }
}