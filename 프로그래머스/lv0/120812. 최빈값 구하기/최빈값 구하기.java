import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[] num_cnt = new int[1000];
        for (int i = 0; i < array.length; i++) {
            num_cnt[array[i]]++;
        }
        int max = -1;
        int max_idx = -1;
        for (int i = 0; i < num_cnt.length; i++) {
            if (num_cnt[i] >= max) {
                max = num_cnt[i];
                max_idx = i;
            }
        }
        int cnt_max = 0;
        for (int i = 0; i < num_cnt.length; i++) {
            if (num_cnt[i] == max) {
                cnt_max++;
            }
        }
        if (cnt_max == 1) {
            answer = max_idx;
        } else {
            answer = -1;
        }
        return answer;
    }
}