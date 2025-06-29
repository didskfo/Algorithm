import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Deque<Integer> que = new ArrayDeque<>();
        for (int m : moves) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][m-1] != 0) {
                    que.add(board[i][m-1]);
                    board[i][m-1] = 0;
                    break;
                }
            }
            if (que.size() >= 2) {
                int a = que.removeLast();
                int b = que.removeLast();
                if (a == b) {
                    answer += 2;
                } else {
                    que.add(b);
                    que.add(a);
                }
            }
        }
        return answer;
    }
}