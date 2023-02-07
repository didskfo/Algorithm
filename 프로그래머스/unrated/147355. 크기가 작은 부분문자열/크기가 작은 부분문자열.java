class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int start = 0;
        for (int i = 0; i < t.length()-p.length()+1; i++) {
            String num = "";
            for (int j = 0; j < p.length(); j++) {
                num += t.charAt(start+j);
            }
            if (Long.parseLong(num) <= Long.parseLong(p)) {
                answer++;
            }
            start++;
        }
        return answer;
    }
}