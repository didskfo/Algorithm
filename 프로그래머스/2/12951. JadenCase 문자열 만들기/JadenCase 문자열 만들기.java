class Solution {
    public String solution(String s) {
        String answer = "";
        char[] arr = s.toLowerCase().toCharArray();
        boolean first = true;
        for (char c : arr) {
            if (c == ' ') {
                answer += c;
                first = true;
            } else if (c >= '0' && c <= '9') {
                answer += c;
                first = false;
            } else {
                if (first) {
                    answer += Character.toUpperCase(c);
                    first = false;
                } else {
                    answer += c;
                }
            }
        }
        return answer;
    }
}