class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        for (int i = 0; i < my_strings.length; i++) {
            int st = parts[i][0];
            int ed = parts[i][1];
            answer += my_strings[i].substring(st, ed+1);
        }
        return answer;
    }
}