import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] stu = new int[n];
        Arrays.fill(stu, 1);
        for (int l : lost) {
            stu[l-1] -= 1;
        }
        for (int r : reserve) {
            stu[r-1] += 1;
        }
        for (int i = 0; i < n; i++) {
            if (stu[i] == 0) {
                if (i != 0 && stu[i-1] > 1) {
                    stu[i] = 1;
                    stu[i-1] -= 1;
                } else if (i < n-1 && stu[i+1] > 1) {
                    stu[i] = 1;
                    stu[i+1] -= 1;
                }
            }
        }
        return n - (int)Arrays.stream(stu).filter(i -> i == 0).count();
    }
}