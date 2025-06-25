class Solution {
    static int[] dx = {-1, 0, 0, 1};
    static int[] dy = {0, -1, 1, 0};
    
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        String color = board[h][w];
        for (int i = 0; i < 4; i++) {
            int nx = h+dx[i];
            int ny = w+dy[i];
            if (nx>=0&&nx<board.length&&ny>=0&&ny<board[0].length&&board[nx][ny].equals(color)) answer++; 
        }
        return answer;
    }
}