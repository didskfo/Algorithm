class Solution {
    public int solution(int n) {
        int answer = 0;
        String three = Integer.toString(n ,3);
        char[] arr = three.toCharArray();
        String rever = "";
        for (int i = arr.length-1; i >= 0; i--) {
            rever += arr[i];
        }
        answer = Integer.parseInt(rever, 3);
        return answer;
    }
}