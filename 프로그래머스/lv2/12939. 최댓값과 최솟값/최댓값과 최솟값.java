class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" ");
        int max = Integer.parseInt(str[0]);
        int min = Integer.parseInt(str[0]);
        for (int i = 0; i < str.length; i++) {
            if (Integer.parseInt(str[i]) >= max) {
                max = Integer.parseInt(str[i]);
            }
        }
        for (int i = 0; i < str.length; i++) {
            if (Integer.parseInt(str[i]) <= min) {
                min = Integer.parseInt(str[i]);
            }
        }
        answer = Integer.toString(min) + " " + Integer.toString(max);
        return answer;
    }
}