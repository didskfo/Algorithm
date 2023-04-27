class Solution {
    public int solution(int[] num_list, int n) {
        int answer = 0;
        for (int a : num_list) {
            if (a == n) {
                return 1;
            }
        }
        return answer;
    }
}