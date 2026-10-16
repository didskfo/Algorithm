class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        String number = "0";
        int num = 1;
        while (number.length() < t*m) {
            number += Integer.toString(num, n).toUpperCase();
            num++;
        }
        
        for (int i = 0; i < number.length(); i++) {
            if (i % m == p-1) answer+= number.charAt(i);
            if (answer.length() == t) break;
        }
        return answer;
    }
}