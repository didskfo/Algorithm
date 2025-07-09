class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int len = cal(video_len);
        int cur = cal(pos);
        int start = cal(op_start);
        int end = cal(op_end);
        for (String com : commands) {
            if (cur >= start && cur < end) {
                cur = end;
            }
            if (com.equals("prev")) {
                cur = Math.max(0, cur-10);
            } else if (com.equals("next")) {
                cur = Math.min(len, cur+10);
            }
        }
        if (cur >= start && cur < end) {
            cur = end;
        }
        int min = cur/60;
        int sec = cur%60;
        return String.valueOf(String.format("%02d", min))+":"+String.valueOf(String.format("%02d", sec));
    }
    
    private int cal(String time) {
        int min = Integer.parseInt(time.split(":")[0]);
        int sec = Integer.parseInt(time.split(":")[1]);
        return min*60 + sec;
    }
}