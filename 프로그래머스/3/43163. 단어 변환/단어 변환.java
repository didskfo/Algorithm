import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        if (!Arrays.asList(words).contains(target)) return 0;
        int[] visited = new int[words.length];
        Deque<Integer> que = new LinkedList<>();
        
        for (int i = 0; i < words.length; i++) {
            if (visited[i] == 0 && diff(begin, words[i])) {
                que.offer(i);
                visited[i] = 1;
            }
        }
        
        while (!que.isEmpty()) {
            int cur = que.poll();
            String str = words[cur];
            if (str.equals(target)) {
                return visited[cur];
            }
            for (int i = 0; i < words.length; i++) {
                if (visited[i] == 0 && diff(str, words[i])) {
                    que.offer(i);
                    visited[i] = visited[cur]+1;
                }
            }
        }
        
        return 0;
    }
    
    public boolean diff(String a, String b) {
        int diff = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) diff++;
            if (diff > 1) return false;
        }
        return diff == 1;
    }
}