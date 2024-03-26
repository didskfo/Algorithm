class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        char[] arr = my_string.toCharArray();
        for (char a : arr) {
            if (Character.toString(a).equals(alp)) {
                answer += Character.toString(a).toUpperCase();
            } else answer += a;
        }
        return answer;
    }
}