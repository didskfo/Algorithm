class Solution {
    public boolean solution(int[][] key, int[][] lock) {
        int m = key.length;
        int n = lock.length;
        int size = n+2*(m-1);
        int[][] space = new int[size][size];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                space[m-1+i][m-1+j] = lock[i][j];
            }
        }
        
        for (int r = 0; r < 4; r++) {
            for (int x = 0; x <= size-m; x++) {
                for (int y = 0; y <= size-m; y++) {
                    for (int i = 0; i < m; i++) {
                        for (int j = 0; j < m; j++) {
                            space[x+i][y+j] += key[i][j];
                        }
                    }
                    
                    if (check(space, m, n)) {
                        return true;
                    }
                    
                    for (int i = 0; i < m; i++) {
                        for (int j = 0; j < m; j++) {
                            space[x+i][y+j] -= key[i][j];
                        }
                    }
                }
            }
            
            key = rotate(key);
        }
        return false;
    }
    
    static boolean check(int[][] space, int m, int n) {
        for (int i = m-1; i < m-1+n; i++) {
            for (int j = m-1; j < m-1+n; j++) {
                if (space[i][j] != 1) return false;
            }
        }
        
        return true;
    }
    
    static int[][] rotate(int[][] key) {
        int m = key.length;
        int[][] rotated = new int[m][m];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                rotated[j][m-1-i] = key[i][j];
            }
        }
        
        return rotated;
    }
}