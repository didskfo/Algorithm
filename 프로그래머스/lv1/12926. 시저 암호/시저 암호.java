class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') {
                answer += " ";
            }  else {
                int a = (int) arr[i];
                if (a >= 65 && a <= 90) {
                    a += n;
                    if (a > 90 && a < 123) {
                    a -= 26;
                }
                } else {
                    a += n;
                    if (a > 122) {
                        a -= 26;
                    }
                }
                char b = (char) a;
                answer += b;
            }
        }
        return answer;
    }
}