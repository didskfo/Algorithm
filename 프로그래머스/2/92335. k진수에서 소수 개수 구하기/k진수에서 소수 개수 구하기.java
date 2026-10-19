class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        String number = Integer.toString(n, k);
        String[] arr = number.split("0");
        
        for (String str : arr) {
            if (str.equals("")) continue;
            
            if (isPrime(Long.parseLong(str))) answer++;
        }
        return answer;
    }
    
    boolean isPrime(long n) {
        if (n < 2) return false;
        
        for (int i = 2; i <= (int)Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}