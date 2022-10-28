class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        char[] arr = my_string.toCharArray();
        for (char a : arr) {
            for (int i = 0; i < n; i++) {
                answer += a;
            }
        }
        return answer;
    }
}