class Solution {
    public int[] solution(int n, int s) {
        int[] answer = new int[n];
        if (s < n) return new int[]{-1};
        int num = s/n;
        int count = s%n;
        for (int i = 0; i < n; i++) {
            answer[i] = num;
        }
        int idx = n-1;
        while (count-- > 0) {
            answer[idx--]++;
        }
        return answer;
    }
}