import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int cnt = 0;
        int total = 0;
        while (!s.equals("1")) {
            int num = s.replaceAll("0", "").length();
            cnt++;
            total += s.length() - num;
            s = Integer.toBinaryString(num);
        }
        answer[0] = cnt;
        answer[1] = total;
        return answer;
    }
}