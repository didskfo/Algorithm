class Solution {
    public int solution(int n, int w, int num) {
        int answer = 0;
        int target = getColumn(num, w);
        for (int i = num; i <= n; i++) {
            if (getColumn(i, w) == target) {
                answer++;
            }
        }
        return answer;
    }
    
    static int getColumn(int i, int w) {
        int layer = (i-1)/w;
        int layerIdx = (i-1)%w;
        
        if (layer % 2 == 0) {
            return layerIdx+1;
        } else {
            return w - layerIdx;
        }
    }
}