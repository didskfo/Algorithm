class Solution {
    public String solution(String myString) {
        String answer = "";
        char[] arr = myString.toCharArray();
        for (char a : arr) {
            if ((int)a < 108) answer += 'l';
            else answer += a;
        }
        return answer;
    }
}