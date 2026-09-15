class Solution {
    public int solution(int[] arr) {
        if (arr.length == 1) return arr[0];
        int answer = 1;
        for (int i = 0; i < arr.length; i++) {
            answer = answer * arr[i] / gcd(answer, arr[i]);
        }
        return answer;
    }
    
    int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a%b;
            a = temp;
        }
        
        return a;
    }
}