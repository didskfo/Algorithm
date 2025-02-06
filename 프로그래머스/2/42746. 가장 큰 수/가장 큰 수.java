import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        ArrayList<Integer> list = new ArrayList<>();
        for (int n : numbers) {
            list.add(n);
        }
        Collections.sort(list, (a, b) -> {
            String sa = String.valueOf(a);
            String sb = String.valueOf(b);
            return -Integer.compare(Integer.parseInt(sa+sb), Integer.parseInt(sb+sa));
        });
        for (int l : list) {
            answer += String.valueOf(l);
        }
        if (answer.charAt(0) == '0') return "0";
        return answer;
    }
}