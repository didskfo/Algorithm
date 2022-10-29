class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for (int i : array) {
            String num = Integer.toString(i);
            char[] arr = num.toCharArray();
            for (char a : arr) {
                if (a == '7') {
                    answer++;
                }
            }
        }
        return answer;
    }
}