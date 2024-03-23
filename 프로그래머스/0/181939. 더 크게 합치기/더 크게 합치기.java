class Solution {
    public int solution(int a, int b) {
        int answer = Math.max(addTwo(Integer.toString(a), Integer.toString(b)), addTwo(Integer.toString(b), Integer.toString(a)));
        return answer;
    }
    
    public int addTwo(String a, String b) {
        String add = a+b;
        return Integer.parseInt(add);
    }
}