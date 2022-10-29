class Solution {
    public int solution(int order) {
        int answer = 0;
        String num = Integer.toString(order);
        char[] arr = num.toCharArray();
        for (char a : arr) {
            int i = (int)(a - '0');
            if ((i % 3 == 0) && (i > 0)) {
                answer++;
            }
        }
        return answer;
    }
}