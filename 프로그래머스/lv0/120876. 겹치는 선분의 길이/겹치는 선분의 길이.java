class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] color = new int[201];
        for (int i = 0; i < lines.length; i++) {
            for (int j = lines[i][0]; j < lines[i][1]; j++) {
                color[j+100]++;
            }
        }
        for (int i = 0; i < color.length; i++) {
            if (color[i] != 0 && color[i] != 1) {
                answer++;
            }
        }
        return answer;
    }
}