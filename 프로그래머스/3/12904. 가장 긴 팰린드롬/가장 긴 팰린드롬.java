class Solution
{
    public int solution(String s)
    {
        int answer = 1;
        for (int i = 0; i < s.length(); i++) {
            //홀수 팰린드롬
            int left = i;
            int right = i;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
                
            }
            answer = Math.max(answer, right-left-1);
            
            //짝수 팰린드롬
            left = i;
            right = i+1;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }
            answer = Math.max(answer, right-left-1);
        }
        return answer;
    }
}