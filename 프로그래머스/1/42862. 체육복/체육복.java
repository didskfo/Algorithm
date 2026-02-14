import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] stu = new int[n];
        for (int i : lost) {
            stu[i-1]--;
        }
        for (int i : reserve) {
            stu[i-1]++;
        }
        for (int i = 0; i < n; i++) {
            if (stu[i] < 0) {
                if (i != 0 && stu[i-1] > 0) {
                    stu[i]++;
                    stu[i-1]--;
                } else if (i < n-1 && stu[i+1] > 0) {
                    stu[i]++;
                    stu[i+1]--;
                }
            }
        }
        return (int)Arrays.stream(stu).filter(i -> i >= 0).count();
    }
}