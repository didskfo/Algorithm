import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        int[] visit = new int[words.length];
        Queue<Integer> que = new ArrayDeque<>();
        
        for (int i = 0; i < words.length; i++) {
            if (visit[i] == 0 && diff(begin, words[i])) {
                que.offer(i);
                visit[i] = 1;
            }
        }
        
        while (!que.isEmpty()) {
            int cur = que.poll();
            String str = words[cur];
            
            if (str.equals(target)) return visit[cur];
            
            for (int i = 0; i < words.length; i++) {
                if (visit[i] == 0 && diff(str, words[i])) {
                    que.offer(i);
                    visit[i] = visit[cur]+1;
                }
            }
        }
        return 0;
    }
    
    static boolean diff(String str1, String str2) {
        int cnt = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) cnt++;
            if (cnt > 1) return false;
        }
        
        return cnt == 1;
    }
}