import java.util.*;

class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        int idx1 = 0;
        int idx2 = 0;
        while (idx1 < A.length && idx2 < B.length) {
            if (A[idx1] < B[idx2]) {
                answer++;
                idx1++;
                idx2++;
            } else {
                idx2++;
            }
        }
        return answer;
    }
}