import java.util.ArrayList;

class Solution {
    public int[] solution(long n) {
        ArrayList<Integer> arr = new ArrayList<>();
        while (n > 0) {
            arr.add((int)(n%10));
            n /= 10;
        }
        int[] answer = arr.stream()
                .mapToInt(i -> i)
                .toArray();
        return answer;
    }
}