import java.util.*;

class Solution {
    static boolean check(int x, int y, char[][] block) {
        if (x + 1 >= block.length || y + 1 >= block[0].length) {
            return false;
        }
        
        char standard = block[x][y];
        if (standard == ' ') {
            return false;
        }

        return block[x][y + 1] == standard
                && block[x + 1][y] == standard
                && block[x + 1][y + 1] == standard;
    }
    
    public int solution(int m, int n, String[] board) {
        int answer = 0;
        char[][] block = new char[m][n];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                block[i][j] = board[i].charAt(j);
            }
        }
        
        while (true) {
            boolean[][] remove = new boolean[m][n];
            boolean change = false;
            
            for (int i = 0; i < m - 1; i++) {
                for (int j = 0; j < n - 1; j++) {
                    if (check(i, j, block)) {
                        remove[i][j] = true;
                        remove[i + 1][j] = true;
                        remove[i][j + 1] = true;
                        remove[i + 1][j + 1] = true;

                        change = true;
                    }
                }
            }
            
            if (!change) {
                break;
            }
            
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (remove[i][j]) {
                        block[i][j] = ' ';
                        answer++;
                    }
                }
            }
            
            for (int col = 0; col < n; col++) {
                int bottom = m - 1;

                for (int row = m - 1; row >= 0; row--) {
                    if (block[row][col] != ' ') {
                        block[bottom][col] = block[row][col];

                        if (bottom != row) {
                            block[row][col] = ' ';
                        }

                        bottom--;
                    }
                }

                while (bottom >= 0) {
                    block[bottom][col] = ' ';
                    bottom--;
                }
            }
        }
        return answer;
    }
}