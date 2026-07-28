class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        int video_len_time = Integer.parseInt(video_len.split(":")[0])*60 + Integer.parseInt(video_len.split(":")[1]);
        int pos_time = Integer.parseInt(pos.split(":")[0])*60 + Integer.parseInt(pos.split(":")[1]);
        int op_start_time = Integer.parseInt(op_start.split(":")[0])*60 + Integer.parseInt(op_start.split(":")[1]);
        int op_end_time = Integer.parseInt(op_end.split(":")[0])*60 + Integer.parseInt(op_end.split(":")[1]);
        
        if (pos_time >= op_start_time && pos_time <= op_end_time) {
            pos_time = op_end_time;
        }
        
        for (String command : commands) {
            if (command.equals("next")) {
                pos_time += 10;
                if (pos_time > video_len_time) pos_time = video_len_time;
                if (pos_time >= op_start_time && pos_time <= op_end_time) {
                    pos_time = op_end_time;
                }
            } else {
                pos_time -= 10;
                if (pos_time < 0) pos_time = 0;
                if (pos_time >= op_start_time && pos_time <= op_end_time) {
                    pos_time = op_end_time;
                }
            }
        }
        
        int min = pos_time/60;
        int sec = pos_time%60;
        if (min < 10) answer += "0";
        answer += Integer.toString(min);
        answer += ":";
        if (sec == 0) {
            answer += "00";
            return answer;
        }
        else if (sec < 10) answer += "0";
        answer += Integer.toString(sec);
        return answer;
    }
}