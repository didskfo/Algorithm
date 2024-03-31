import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> arrlist = new ArrayList<>();
        for (int i : arr) {
            for (int j = 0; j < i; j++) {
                arrlist.add(i);
            }
        }
        int[] answer = new int[arrlist.size()];
        int idx = 0;
        for (int i : arrlist) {
            answer[idx++] = i;
        }
        return answer;
    }
}