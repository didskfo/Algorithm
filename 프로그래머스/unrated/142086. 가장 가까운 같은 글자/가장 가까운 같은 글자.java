class Solution {
    public int[] solution(String s) {
        char[] arr = s.toCharArray();
        int[] answer = new int[arr.length];
        for (int i = 1; i < arr.length; i++) {
            boolean chk = false;
            char ori = arr[i];
            int cnt = 0;
            for (int j = 1; i-j >= 0; j++) {
                cnt++;
                if (ori == arr[i-j]) {
                    chk = true;
                    answer[i] = cnt;
                    break;
                }
            }
            if (!chk) {
                answer[i] = -1;
            }
        }
        answer[0] = -1;
        return answer;
    }
}