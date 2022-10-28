class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        char let = letter.charAt(0);
        char[] arr = my_string.toCharArray();
        for (char a : arr) {
            if(a != let) {
                answer += a;
            }
        }
        return answer;
    }
}