class Solution {
    public int solution(int[][] board, int[][] skill) {
        int answer = 0;
        int[][] sum = new int[board.length+1][board[0].length+1];
        for (int[] sk : skill) {
            int type = sk[0];
            int r1 = sk[1];
            int c1 = sk[2];
            int r2 = sk[3];
            int c2 = sk[4];
            int degree = sk[5];

            if (type == 1) {
                degree = -degree;
            }
            
            sum[r1][c1] += degree;
            sum[r1][c2+1] -= degree;
            sum[r2+1][c1] -= degree;
            sum[r2+1][c2+1] += degree;
        }
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 1; j < board[0].length; j++) {
                sum[i][j] += sum[i][j-1];
            }
        }
        
        for (int i = 1; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                sum[i][j] += sum[i-1][j];
            }
        }
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] + sum[i][j] > 0) answer++;
            }
        }
        return answer;
    }
}