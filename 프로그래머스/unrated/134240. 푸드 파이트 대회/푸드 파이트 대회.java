class Solution {
    public String solution(int[] food) {
        String answer = "";
        for (int i = 1; i < food.length; i++) {
            if (food[i] > 1) {
                for (int j = 0; j < food[i]/2; j++) {
                    answer += Integer.toString(i);
                }
            }
        }
        String half = answer;
        answer += "0";
        StringBuffer sb = new StringBuffer(half);
        String reversedStr = sb.reverse().toString();
        answer += reversedStr;
        return answer;
    }
}