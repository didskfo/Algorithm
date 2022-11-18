class Solution {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int denum3 = num2 * denum1 + num1 * denum2;
        int num3 = num1 * num2;
        int max = 1;
        for (int i = 1; i <= num3 && i <= denum3; i++) {
            if (num3 % i == 0 && denum3 % i == 0) {
                max = i;
            }
        }
        denum3 = denum3 / max;
        num3 = num3 / max;
        int[] answer = {denum3, num3};
        return answer;
    }
}