class Solution {
    public String solution(int a, int b) {
        int[] mon = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30};
        String[] day = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int num = 0;
        for(int i = 0; i < a; i++){
            num += mon[i];
        }
        num += b;
        num = num % 7;
        String answer = day[num];
        
        return answer;
    }
}