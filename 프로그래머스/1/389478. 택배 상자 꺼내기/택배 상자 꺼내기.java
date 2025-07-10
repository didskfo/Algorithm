class Solution {
    public int solution(int n, int w, int num) {
        if (w == 1) {
            return n - num + 1;
        }
        
        int targetCol = getColumn(num, w);
        int count = 0;
        
        for (int i = num; i <= n; i++) {
            if (getColumn(i, w) == targetCol) {
                count++;
            }
        }
        
        return count;
    }
    
    private int getColumn(int i, int w) {
        int layer      = (i - 1) / w;      
        int idxInLayer = (i - 1) % w;      

        if (layer % 2 == 0) {
            return idxInLayer + 1;        
        } else {
            return w - idxInLayer;         
        }
    }
}