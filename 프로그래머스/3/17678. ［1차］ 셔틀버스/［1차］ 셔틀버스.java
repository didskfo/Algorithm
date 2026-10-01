import java.util.*;

class Solution {
    public String solution(int n, int t, int m, String[] timetable) {
        String answer = "";
        int idx = 0;
        
        int[] crew = new int[timetable.length];
        for (int i = 0; i < timetable.length; i++) {
            crew[i] = toMinute(timetable[i]);
        }
        
        Arrays.sort(crew);
                
        for (int i = 0; i < n; i++) {
            int busTime = 540 + t*i;
            int cnt = 0;
            
            while (idx < crew.length && crew[idx] <= busTime && cnt < m) {
                idx++;
                cnt++;
            }
            
            if (i == n-1) {
                if (cnt < m) answer = String.format("%02d:%02d", busTime / 60, busTime % 60);
                else {
                    int time = crew[idx-1]-1;
                    answer = String.format("%02d:%02d", time / 60, time % 60);
                }
            }
        }
        
        return answer;
    }
    
    static int toMinute(String str) {
        String[] lst = str.split(":");
        return Integer.parseInt(lst[0])*60 + Integer.parseInt(lst[1]);
    }
}