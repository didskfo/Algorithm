import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        int[] per1 = {1, 2, 3, 4, 5};
        int[] per2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] per3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int a = 0; int b = 0; int c = 0;
        int idx = 0;
        for (int i : answers) {
            if (per1[idx % 5] == i) a++;
            if (per2[idx % 8] == i) b++;
            if (per3[idx % 10] == i) c++;
            idx++;
        }
        ArrayList<Integer> arr = new ArrayList<>();
        int max = Math.max(Math.max(a, b), c);
        if (max == a) arr.add(1);
        if (max == b) arr.add(2);
        if (max == c) arr.add(3);
        int answer[] = arr.stream()
                .mapToInt(i -> i)
                .toArray();
        return answer;
    }
}