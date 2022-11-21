class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 1) {
                    for (int k = 0; k < dx.length; k++) {
                        for (int q = 0; q < dy.length; q++) {
                            if (i+dy[q] >= 0 && i+dy[q] < board.length && j+dx[k] >= 0 && j+dx[k] < board[0].length) {
                                if (board[i+dy[q]][j+dx[k]] != 1) {
                                    board[i+dy[q]][j+dx[k]]--;
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 0) {
                    answer++;
                }
            }
        }
        return answer;
    }
}