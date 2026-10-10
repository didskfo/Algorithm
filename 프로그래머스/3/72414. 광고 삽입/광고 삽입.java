class Solution {
    public String solution(String play_time, String adv_time, String[] logs) {
        int time = toSecond(play_time);
        int adv = toSecond(adv_time);
        
        int[] viewers = new int[time+2];
        for (String log : logs) {
            String[] l = log.split("-");
            int start = toSecond(l[0]);
            int end = toSecond(l[1]);
            viewers[start]++;
            viewers[end]--;
        }
        
        for (int i = 1; i <= time; i++) {
            viewers[i] += viewers[i-1];
        }
        
        long[] viewCount = new long[time+1];
        for (int i = 0; i < time; i++) {
            viewCount[i+1] = viewCount[i]+viewers[i];
        }
        
        long max = -1;
        long answer = 0;
        for (int start = 0; start + adv <= time; start++) {
            long watchTime = viewCount[start + adv] - viewCount[start];
            if (watchTime > max) {
                max = watchTime;
                answer = start;
            }
        }
        return String.format("%02d:%02d:%02d", answer/3600, (answer%3600)/60, answer%60) ;
    }
    
    static int toSecond(String time) {
        String[] t = time.split(":");
        
        return Integer.parseInt(t[0])*3600 + Integer.parseInt(t[1])*60 + Integer.parseInt(t[2]);
    }
}