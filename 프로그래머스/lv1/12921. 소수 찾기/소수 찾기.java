import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 2; i <= n; i++){
            int cnt = 0;
            int end = (int)Math.sqrt(i);
            for(int j = 1; j <= end; j++){
                if(i % j == 0){
                    cnt++;
                }
                if(cnt > 1) {
                    break;
                }
            }
            if(cnt == 1){
                answer += 1;
            }
        }
        return answer;
    }
}