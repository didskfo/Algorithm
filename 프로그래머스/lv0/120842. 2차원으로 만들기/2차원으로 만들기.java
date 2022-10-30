class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        int i = 0;
        while (i < num_list.length) {
            for (int idx_0 = 0; idx_0 < answer.length; idx_0++) {
                for (int idx_1 = 0; idx_1 < n; idx_1++) {
                    answer[idx_0][idx_1] = num_list[i];
                    i++;
                }
            }
        }
        return answer;
    }
}