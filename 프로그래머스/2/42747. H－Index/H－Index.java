import java.util.*;

class Solution {
    public int solution(int[] citations) {
        Integer[] arr = Arrays.stream(citations).boxed().toArray(Integer[]::new); 
        Arrays.sort(arr, Collections.reverseOrder());
        int idx = 0;
        for (int i : arr) {
            if (i <= idx+1) {
                return Math.max(i, idx);
            }
            idx++;
        }
        return arr.length;
    }
}