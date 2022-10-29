class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        int v = box[0] / n;
        int h = box[1] / n;
        int high = box[2] / n;
        answer = v*h*high;
        return answer;
    }
}