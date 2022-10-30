import java.util.*;
class Solution {
    public String[] solution(String my_str, int n) {
        char[] arr = my_str.toCharArray();
        ArrayList<String> list = new ArrayList<String>();
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            if ((i+1)%n != 0) {
                str += arr[i];
            } else {
                str += arr[i];
                list.add(str);
                str = "";
            }
        }
        if (!str.equals("")) {
            list.add(str);
        }
        String[] answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}