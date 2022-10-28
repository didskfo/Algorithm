class Solution {
    public int solution(String my_string) {
        int answer = 0;
        char[] arr = my_string.toCharArray();
        for (char a : arr) {
            int i = a - '0';
            if (i > 0 && i < 10) {
                answer += i;
            }
        }
        return answer;
    }
}