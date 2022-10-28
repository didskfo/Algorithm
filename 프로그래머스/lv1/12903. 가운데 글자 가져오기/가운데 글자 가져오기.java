class Solution {
    public String solution(String s) {
        char[] arr = s.toCharArray();
        String answer = "";
        int cen = s.length() / 2;
        if(s.length() % 2 == 0){
            answer += arr[cen-1];
            answer += arr[cen];
        }else{
            answer += arr[cen];
        }
        return answer;
    }
}