class Solution {
    public int solution(String s) {
        char x = s.charAt(0);
        int cnt1 = 1;
        int cnt2 = 0;
        int answer = 0;
        
        for (int i=1;i<s.length();i++) {
            if (x==' ') {
                x = s.charAt(i);
                continue;
            }
            if (x==s.charAt(i)) {
                cnt1++;
            } else {
                cnt2++;
            }
            if (cnt1==cnt2) {
                answer++;
                x = ' ';
                cnt1 = 1;
                cnt2 = 0;
            }
        }
        if (x!=' ') {
            answer++;
        }
        return answer;
    }
}