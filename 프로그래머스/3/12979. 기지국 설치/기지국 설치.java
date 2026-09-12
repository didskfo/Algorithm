class Solution {
    public int solution(int n, int[] stations, int w) {
        int answer = 0;
        int cover = 2*w + 1;
        int start = 1;
        int len = 0;
        for (int station : stations) {
            len = station - w - start;
            if (len > 0) {
                answer += Math.ceil((double)len/cover);
            }
            start = station + w + 1;
        }
        if (start <= n) {
            len = n - start + 1;
            answer += Math.ceil((double)len/cover);
        }
        return answer;
    }
}