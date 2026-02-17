import java.util.*;

class Solution {
    public int solution(int N, int number) {
        if (N == number) return 1;
        ArrayList<HashSet<Integer>> dp = new ArrayList<>();
        for (int i = 0; i <= 8; i++) {
            dp.add(new HashSet<>());
        }
        dp.get(1).add(N);
        for (int i = 2; i <= 8; i++) {
            HashSet<Integer> set = dp.get(i);
            for (int j = 1; j < i; j++) {
                for (int a : dp.get(j)) {
                    for (int b : dp.get(i-j)) {
                        set.add(a+b);
                        set.add(a-b);
                        set.add(a*b);
                        if (b != 0) set.add(a/b);
                    }
                }
            }
            set.add(Integer.parseInt(String.valueOf(N).repeat(i)));
            if (set.contains(number)) return i;
        }
        return -1;
    }
}