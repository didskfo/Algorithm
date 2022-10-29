class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String tmp = Integer.toString(num);
        int[] arr = new int[tmp.length()];
        for (int i = 0; i < tmp.length(); i++) {
            arr[i] = tmp.charAt(i) - '0';
        }
        int idx = 0;
        for (int i : arr) {
            if (i == k) {
                answer = idx+1;
            } else {
                idx++;
            }
        }
        if (answer == 0) answer = -1;
        return answer;
    }
}