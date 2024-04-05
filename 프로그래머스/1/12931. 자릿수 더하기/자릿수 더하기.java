import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        char[] arr = Integer.toString(n).toCharArray();
        for (char a : arr) {
            answer += a - '0';
        }

        return answer;
    }
}