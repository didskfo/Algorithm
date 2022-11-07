import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        char[] lst = s.toCharArray();
        ArrayList<Character> arr = new ArrayList<>();
        for (char a : lst) {
            if (a == '(') {
                arr.add(a);
            } else if (a == ')') {
                if (arr.size() == 0) {
                    return false;
                } else {
                    arr.remove(arr.size()-1);
                }
            }
        }
        if (arr.size() != 0) {
            return false;
        }

        return answer;
    }
}