import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        char[] arr = my_string.toCharArray();
        int cnt = 0;
        for (char a : arr) {
            int i = a - '0';
            if (i >= 0 && i < 10) {
                cnt++;
                list.add(i);
            }
        }
        Collections.sort(list);
        int[] answer = new int[cnt];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}