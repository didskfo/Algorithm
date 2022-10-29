class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] arr = my_string.toCharArray();
        for (char a : arr) {
            String str = Character.toString(a);
            if (!answer.contains(str)) {
                answer += a;
            }
        }
        return answer;
    }
}