class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        for (int i = 1; i <= yellow; i++) {
            if (yellow % i == 0) {
                int a = yellow / i;
                int b = i;
                if ((a+2) * (b+2) == brown+yellow) {
                    return new int[]{a+2, b+2};
                }
            }
        }
        return answer;
    }
}