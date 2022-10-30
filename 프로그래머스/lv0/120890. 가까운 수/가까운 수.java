class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int min = 1000;
        int min_num = 1000;
        for (int i : array) {
            if (Math.abs(i - n) <= min) {
                if (Math.abs(i - n) == min) {
                    if (min_num >= i) {
                        min = Math.abs(i - n);
                        min_num = i;
                    }
                } else {
                    min = Math.abs(i - n);
                    min_num = i;
                }
                
                
            }
        }
        answer = min_num;
        return answer;
    }
}