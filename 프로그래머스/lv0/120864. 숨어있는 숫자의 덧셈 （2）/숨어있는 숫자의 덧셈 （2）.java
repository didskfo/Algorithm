import java.util.*;
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for (int i = 0; i < my_string.length(); i++) {
            String num = "";
            if (Character.isDigit(my_string.charAt(i))) {
                num += my_string.charAt(i);
                while(i+1 < my_string.length() && Character.isDigit(my_string.charAt(i+1))) {
                    num += my_string.charAt(i+1);
                    i++;
                }
            }
            if (!num.equals("")){
                answer += Integer.parseInt(num);
            }
        }
        return answer;
    }
}