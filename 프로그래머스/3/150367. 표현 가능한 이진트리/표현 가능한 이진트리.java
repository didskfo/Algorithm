import java.util.*;

class Solution {
    public int[] solution(long[] numbers) {
        int[] answer = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            String number = Long.toBinaryString(numbers[i]);
            
            int l = number.length();
            int len = 1;
            while (len < l) {
                len = len*2+1;
            }
            number = "0".repeat(len-l) + number;
            
            if (check(number, 0, len-1, false)) answer[i] = 1;
            else answer[i] = 0;
        }
        return answer;
    }
    
    static boolean check(String number, int start, int end, boolean parentZero) {
        if (start > end) return true;
        
        int mid = (start+end)/2;
        char cur = number.charAt(mid);
        
        if (parentZero && cur == '1') return false;
        
        boolean currentZero = cur == '0' ? true : false;
        
        return check(number, start, mid-1, currentZero) && check(number, mid+1, end, currentZero);
    }
}