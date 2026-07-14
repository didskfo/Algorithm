import java.util.*;

class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        String str = Integer.toString(n, k);
        String[] arr = str.split("0");
        for (String a : arr) {
            if (a.equals("")) continue;
            if (isPrime(Long.parseLong(a))) answer++;
        }
        return answer;
    }
    
    static boolean isPrime(long n) {
        if (n < 2) return false;
        for (int i = 2; i <= (int)Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}