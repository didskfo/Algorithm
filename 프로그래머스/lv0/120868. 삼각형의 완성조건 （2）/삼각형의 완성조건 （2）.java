class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = 0;
        if (sides[0] >= sides[1]) {
            max = sides[0];
            for (int i = 1; i <= sides[0]; i++) {
                if (i + sides[1] > sides[0]) {
                    answer++;
                }
            }
            for (int i = max+1; i < sides[0] + sides[1]; i++) {
                answer++;
            }
        } else {
            max = sides[1];
            for (int i = 1; i <= sides[1]; i++) {
                if (i + sides[0] > sides[1]) {
                    answer++;
                }
            }
            for (int i = max+1; i < sides[0] + sides[1]; i++) {
                answer++;
            }
        }
        return answer;
    }
}