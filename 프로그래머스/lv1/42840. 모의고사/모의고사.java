import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int[] cnt = {0, 0, 0};
        int[] ans1 = {1, 2, 3, 4, 5};
        int[] ans2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] ans3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int idx1 = 0, idx2 = 0, idx3 = 0;
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == ans1[idx1++%ans1.length]) {
                cnt[0]++;
            }
            if (answers[i] == ans2[idx2++%ans2.length]) {
                cnt[1]++;
            }
            if (answers[i] == ans3[idx3++%ans3.length]) {
                cnt[2]++;
            }
        }
        int max = 0;
        int count = 0;
        for (int i = 0; i < 3; i++) {
            if (cnt[i] >= max) {
                max = cnt[i];
            }
        }
        for (int i = 0; i < 3; i++) {
            if (cnt[i] == max) {
                arr.add(i+1);
                count++;
            }
        }
        int[] answer = new int[count];
        for (int i = 0; i < count; i++) {
            answer[i] = arr.get(i);
        }
        return answer;
    }
}