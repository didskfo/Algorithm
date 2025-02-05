import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] p1 = {1, 2, 3, 4, 5};
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int a = 0;
        int b = 0; 
        int c = 0;
        
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == p1[i%5]) a++;
            if (answers[i] == p2[i%8]) b++;
            if (answers[i] == p3[i%10]) c++;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        int max = Math.max(Math.max(a, b), c);
        if (max == a) ans.add(1);
        if (max == b) ans.add(2);
        if (max == c) ans.add(3);
        
        return ans.stream().mapToInt(i -> i).toArray();
    }
}