import java.util.Arrays;

class Solution {
    public long solution(long n) {
        char[] arr = String.valueOf(n).toCharArray();
        int[] arr2 = new int[arr.length];
        Arrays.setAll(arr2, i -> Character.getNumericValue(arr[i]));
        
        Arrays.sort(arr2);
        String answer = "";
        for (int i = arr2.length-1; i >= 0; i--) {
            answer += Integer.toString(arr2[i]);
        }
        return Long.parseLong(answer);
    }
}