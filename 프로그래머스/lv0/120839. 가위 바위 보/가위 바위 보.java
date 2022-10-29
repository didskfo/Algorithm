class Solution {
    public String solution(String rsp) {
        String answer = "";
        char[] arr = rsp.toCharArray();
        for (char a : arr) {
            if (a == '2') {
                answer += '0';
            } else if (a == '0') {
                answer += '5';
            } else if (a == '5') {
                answer += '2';
            }
        }
        return answer;
    }
}