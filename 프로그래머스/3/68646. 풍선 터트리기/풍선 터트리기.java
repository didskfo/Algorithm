class Solution {
    public int solution(int[] a) {
        int answer = 2;
        int n = a.length;
        int[] minLeft = new int[n];
        int[] minRight = new int[n];
        
        minLeft[0] = a[0];
        minRight[n-1] = a[n-1];
        
        for (int i = 0; i < n; i++) {
            if (i != 0) minLeft[i] = Math.min(minLeft[i-1], a[i]);
            if (i != n-1) minRight[n-i-2] = Math.min(minRight[n-i-1], a[n-i-2]);
        }
        
        for (int i = 1; i < n-1; i++) {
            if (a[i] < minLeft[i-1] || a[i] < minRight[i+1]) answer++;
        }
        return answer;
    }
}