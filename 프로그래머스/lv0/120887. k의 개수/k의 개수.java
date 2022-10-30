import java.util.*;
class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        char target = (char)(k + 48);
        for (int start = i; start <= j; start++) {
            String num = Integer.toString(start);
            char[] arr = num.toCharArray();
            for (int a = 0; a < arr.length; a++) {
                if (arr[a] == target) {
                    answer++;
                }
            }
        }
        return answer;
    }
}