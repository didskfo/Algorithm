class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String alph = "";
        alph = a+""+b;
        answer = Integer.parseInt(alph) >= 2*a*b ? Integer.parseInt(alph) : 2*a*b;
        return answer;
    }
}