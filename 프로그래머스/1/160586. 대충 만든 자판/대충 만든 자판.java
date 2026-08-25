import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        int[] minCnt = new int[26];
        Arrays.fill(minCnt, Integer.MAX_VALUE);
        for (String key : keymap) {
            for (int i = 0; i < key.length(); i++) {
                int c = key.charAt(i)-'A';
                minCnt[c] = Math.min(minCnt[c], i+1);
            }
        }
        
        for (int i = 0; i < targets.length; i++) {
            String target = targets[i];
            int cnt = 0;
            for (int j = 0; j < target.length(); j++) {
                if (minCnt[target.charAt(j)-'A'] == Integer.MAX_VALUE) {
                    cnt = -1;
                    break;
                } 
            
                cnt += minCnt[target.charAt(j)-'A'];
            }
            
            answer[i] = cnt;
        }
        return answer;
    }
}