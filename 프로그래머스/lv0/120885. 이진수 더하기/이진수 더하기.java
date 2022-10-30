import java.util.*;
class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        int bina = Integer.parseInt(bin1, 2);
        int binb = Integer.parseInt(bin2, 2);
        int sum = bina + binb;
        answer = Integer.toBinaryString(sum);
        return answer;
    }
}