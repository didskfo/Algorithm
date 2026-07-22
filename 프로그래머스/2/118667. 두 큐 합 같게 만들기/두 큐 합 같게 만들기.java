class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int n = queue1.length;
        long total = 0;
        long sum = 0;
        
        int[] queue = new int[n*2];
        for (int i = 0; i < n; i++) {
            queue[i] = queue1[i];
            queue[n+i] = queue2[i];
            
            sum += queue1[i];
            total += queue1[i];
            total += queue2[i];
        }
        
        if (total % 2 != 0) return -1;
        
        long target = total/2;
        
        int left = 0;
        int right = n;
        int cnt = 0;
        
        while (left < n*2 && right < n*2) {
            if (sum == target) return cnt;
            if (sum < target) {
                sum += queue[right];
                right++;
            } else {
                sum -= queue[left];
                left++;
            }
            cnt++;
        }
        
        while (left < n*2) {
            if (sum == target) return cnt;
            if (sum < target) break;
            else {
                sum -= queue[left];
                left++;
            }
            cnt++;
        }
        
        return sum == target ? cnt : -1;
    }
}