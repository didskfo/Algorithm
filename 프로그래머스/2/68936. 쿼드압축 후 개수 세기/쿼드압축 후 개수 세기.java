class Solution {
    int[][] map;
    int[] answer = new int[2];
    
    public int[] solution(int[][] arr) {
        this.map = arr;
        quad(0, 0, arr.length);
        return answer;
    }
    
    void quad(int x, int y, int size) {
        if (check(x, y, size)) {
            answer[map[x][y]]++;
            return;
        }
        size /= 2;
        quad(x, y, size);
        quad(x+size, y, size);
        quad(x, y+size, size);
        quad(x+size, y+size, size);
    }
    
    boolean check(int x, int y, int l) {
        int num = map[x][y];
        for (int i = x; i < x+l; i++) {
            for (int j = y; j < y+l; j++) {
                if (map[i][j] != num) return false;
            }
        }
        return true;
    }
}