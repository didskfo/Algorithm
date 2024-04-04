import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(n);
        while (n != 1) {
            if (n % 2 == 0) n /= 2;
            else n = 3*n+1;
            arr.add(n);
        }
        int[] answer = arr.stream()
            .mapToInt(i -> i)
            .toArray();
        return answer;
    }
}