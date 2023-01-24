import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        Arrays.sort(numlist);
        for (int i = 0; i < numlist.length; i++) {
            for (int j = 0; j < numlist.length; j++) {
                if (Math.abs(numlist[i]-n) <= Math.abs(numlist[j]-n)) {
                    int temp = numlist[j];
                    numlist[j] = numlist[i];
                    numlist[i] = temp;
                }
            }
        }
        return numlist;
    }
}