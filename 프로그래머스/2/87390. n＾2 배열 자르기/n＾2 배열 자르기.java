class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right-left+1)];
        int idx = 0;
        for (long k = left; k <= right; k++) {
            int i = (int)(k / n);
            int j = (int)(k % n);
            answer[idx++] = Math.max(i, j)+1;
        }
        
        return answer;
    }
}