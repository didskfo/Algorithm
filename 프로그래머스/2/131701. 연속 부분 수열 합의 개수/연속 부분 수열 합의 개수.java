import java.util.*;
class Solution {
    public int solution(int[] elements) {
        int len = elements.length;
        int[] circle = new int[2*len];
        System.arraycopy(elements, 0, circle, 0, len);
        System.arraycopy(elements, 0, circle, len, len);

        Set<Integer> set = new HashSet<>();
        for (int k = 1; k <= len; k++) {
            for (int i = 0; i < len; i++) {
                int sum = 0;
                for (int j = 0; j < k; j++) {
                    sum += circle[i+j];
                }
                set.add(sum);
            }
        }
        return set.size();
    }
}