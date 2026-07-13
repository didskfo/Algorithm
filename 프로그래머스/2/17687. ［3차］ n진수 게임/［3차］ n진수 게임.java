class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        String str = "0";
        int num = 1;
        while (str.length() < t*m) {
            str += Integer.toString(num, n).toUpperCase();
            num++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (i % m == p-1) {
                answer += str.charAt(i);
            }
            if (answer.length() == t) {
                break;
            }
        }
        return answer;
    }
}