import java.util.*;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        for (int i = 0; i < citations.length; i++) {
            if (i+1 >= citations[citations.length-i-1]) {
                return Math.max(i, citations[citations.length-i-1]);
            }
        }
        return citations.length;
    }
}