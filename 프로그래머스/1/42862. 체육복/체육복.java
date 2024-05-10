import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] stu = new int[n];
        Arrays.fill(stu, 1);
        
        for (int l : lost) stu[l-1] -= 1 ;
        
        for (int r : reserve) stu[r-1] += 1;
        
        for (int i = 0; i < n; i++) {
            if (stu[i] == 0) {
                if (i-1 >= 0 && stu[i-1] > 1) {
                    stu[i] = 1;
                    stu[i-1] -= 1;
                    continue;
                }
                if (i+1 < n && stu[i+1] > 1) {
                    stu[i] = 1;
                    stu[i+1] -= 1;
                    continue;
                }
            }
        }
                
        for (int i : stu) {
            if (i == 0) n--; 
        }
        return n;
    }
}