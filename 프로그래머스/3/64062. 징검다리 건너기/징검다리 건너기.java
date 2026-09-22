import java.util.*;

class Solution {
    public int solution(int[] stones, int k) {
        int answer = 0;
        int left = 1;
        int right = Arrays.stream(stones).max().getAsInt();
        
        while (left <= right) {
            int mid = (left+right)/2;
            int cnt = 0;
            boolean check = true;
            
            for (int st : stones) {
                if (st < mid) {
                    cnt++;
                } else {
                    cnt = 0;
                }
                
                if (cnt >= k) {
                    check = false;
                    break;
                }
            }
            
            if (check) {
                left = mid+1;
                answer = mid;
            } else {
                right = mid-1;
            }
        }
        return answer;
    }
}