import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        Integer[] arr = Arrays.stream(numbers).boxed().toArray(Integer[]::new);

        Comparator<Integer> customComparator = (a, b) -> {
            String ab = String.valueOf(a) + String.valueOf(b);
            String ba = String.valueOf(b) + String.valueOf(a);
            
            return -ab.compareTo(ba);
        };
        
        Arrays.sort(arr, customComparator);
        int[] sortedArr = Arrays.stream(arr).mapToInt(Integer::intValue).toArray();
        String answer = "";
        for (int i : sortedArr) answer += i;
        if (answer.charAt(0) == '0') answer = "0";
        return answer;
    }
}