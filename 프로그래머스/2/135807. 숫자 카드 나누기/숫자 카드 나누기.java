class Solution {
    public int solution(int[] arrayA, int[] arrayB) {
        int answer = 0;
        int maxA = maxGcd(arrayA);
        int maxB = maxGcd(arrayB);
        
        if (!divideCheck(maxA, arrayB)) answer = maxA;
        if (!divideCheck(maxB, arrayA)) answer = Math.max(answer, maxB);
        return answer;
    }
    
    boolean divideCheck(int num, int[] arr) {
        if (num == 1) return true;
        for (int a : arr) {
            if (a % num == 0) return true;
        }
        return false;
    }
    
    int maxGcd(int[] arr) {
        int m = arr[0];
        for (int i = 1; i < arr.length; i++) {
            m = gcd(m, arr[i]);
        }
        return m;
    }
    
    int gcd(int a, int b) {
        while (b != 0) {
            int t = a % b;
            a = b; b = t;
        }
        return a;
    }
}