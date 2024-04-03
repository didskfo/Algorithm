class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        myString = myString.replaceAll("A", "b");
        myString = myString.replaceAll("B", "a");
        myString = myString.replaceAll("b", "B");
        myString = myString.replaceAll("a", "A");
        answer = myString.contains(pat) ? 1 : 0;
        return answer;
    }
}