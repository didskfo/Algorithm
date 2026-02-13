import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int sa = 0;
        int sb = 0;
        int sc = 0;
        for (int i = 0; i < answers.length; i++) {
            int an = answers[i];
            if (an == a[i%5]) sa++;
            if (an == b[i%8]) sb++;
            if (an == c[i%10]) sc++;
        }
        int max = Math.max(sa, Math.max(sb, sc));
        ArrayList<Integer> answer = new ArrayList<>();
        if (max == sa) answer.add(1);
        if (max == sb) answer.add(2);
        if (max == sc) answer.add(3);
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}