import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> fib = new ArrayList<Integer>();
        fib.add(0);
        fib.add(1);
        for (int i = 2; i <= n; i++) {
            int a = fib.get(i-2) % 1234567;
            int b = fib.get(i-1) % 1234567;
            fib.add(a+b);
        }
        answer = fib.get(n) % 1234567;
        return answer;
    }
}