class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = 2;
        while(n % num != 1){
            num += 1;
        }
        answer = num;
        return answer;
    }
}