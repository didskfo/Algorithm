class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char[] arr = my_string.toCharArray();
        char tmp1 = arr[num1];
        char tmp2 = arr[num2];
        arr[num1] = tmp2;
        arr[num2] = tmp1;
        for (char a : arr) {
            answer += a;
        }
        return answer;
    }
}