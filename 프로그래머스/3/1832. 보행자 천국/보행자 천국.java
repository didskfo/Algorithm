class Solution {
    int MOD = 20170805;
    public int solution(int m, int n, int[][] cityMap) {
        int[][] down = new int[m][n];
        int[][] right = new int[m][n];
        
        down[0][0] = 1;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) continue;
                if (cityMap[i][j] == 1) continue;
                
                if (i > 0) {
                    if (cityMap[i-1][j] == 0) {
                        down[i][j] = (down[i-1][j] + right[i-1][j]) % MOD;
                    } else if (cityMap[i-1][j] == 2) {
                        down[i][j] = down[i-1][j] % MOD;
                    }
                }
                
                if (j > 0) {
                    if (cityMap[i][j-1] == 0) {
                        right[i][j] = (down[i][j-1] + right[i][j-1]) % MOD;
                    } else if (cityMap[i][j-1] == 2) {
                        right[i][j] = right[i][j-1] % MOD;
                    }
                }
            }
        }
        return (down[m-1][n-1] + right[m-1][n-1]) % MOD;
    }
}