class Solution {
    public int solution(int n) {
        int answer = 0;
        int fib = 1;
        int i = 1;
        while (fib <= n) {
            fib = fib * i;
            i++;
        }
        answer = i-2;
        return answer;
    }
}