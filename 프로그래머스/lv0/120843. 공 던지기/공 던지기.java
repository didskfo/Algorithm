class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int getball = 1;
        for (int i = 0; i < k-1; i++) {
            getball += 2;
            if (getball > numbers.length) {
                getball -= numbers.length;
            }
        }
        answer = getball;
        return answer;
    }
}