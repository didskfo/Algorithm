class Solution {
    public long solution(int[] sequence) {
        int n = sequence.length;
        long[] even = new long[n];
        long[] odd = new long[n];
        
        even[0] = sequence[0];
        odd[0] = -sequence[0];
        
        long answer = Math.max(even[0], odd[0]);
        
        for (int i = 1; i < n; i++) {
            long a = (i % 2 == 0) ? sequence[i] : -sequence[i];
            long b = -a;
            
            even[i] = Math.max(even[i-1]+a, a);
            odd[i] = Math.max(odd[i-1]+b, b);
            
            answer = Math.max(Math.max(even[i], odd[i]), answer);
        }
        return answer;
    }
}