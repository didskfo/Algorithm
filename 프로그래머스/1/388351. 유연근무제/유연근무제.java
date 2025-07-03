class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int len = schedules.length;
        int answer = len;
        int[] due = new int[len];
        for (int i = 0; i < len; i++) {
            int hour = schedules[i]/100;
            int minute = schedules[i]%100 + 10;
            if (minute >= 60) {
                hour += 1;
                minute -= 60;
            }
            due[i] = hour*100+minute;
        }
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < 7; j++) {
                int cur = startday+j;
                if (cur%7 == 6 || cur%7 == 0) {
                    continue;
                }
                if (timelogs[i][j] > due[i]) {
                    answer--;
                    break;
                }
            }
        }
        return answer;
    }
}