class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = schedules.length;
        int[] late = new int[schedules.length];
        for (int i = 0; i < schedules.length; i++) {
            int hour = schedules[i] / 100;
            int minute = schedules[i] % 100 + 10;
            if (minute >= 60) {
                hour++;
                minute -= 60;
            }
            late[i] = hour*100+minute;
        }
        
        for (int i = 0; i < timelogs.length; i++) {
            for (int j = 0; j < 7; j++) {
                if ((startday+1+j)%7 <= 1) continue;
                if (timelogs[i][j] > late[i]) {
                    answer--;
                    break;
                }
            }
        }
        return answer;
    }
}