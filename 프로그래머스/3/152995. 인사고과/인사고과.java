import java.util.*;

class Solution {
    public int solution(int[][] scores) {
        int answer = 1;
        int[] target = new int[]{scores[0][0], scores[0][1]};
        Arrays.sort(scores, (a, b) -> a[0]==b[0]?Integer.compare(a[1], b[1]):Integer.compare(b[0], a[0]));
        
        ArrayList<int[]> incent = new ArrayList<>();
        incent.add(scores[0]);
        int max = scores[0][1];
        for (int i = 1; i < scores.length; i++) {
            max = Math.max(max, scores[i][1]);
            if (scores[i][1] < max) {
                if (scores[i][0] == target[0] && scores[i][1] == target[1]) {
                    return -1;
                }
                continue;
            }
            incent.add(scores[i]);
        }
        
        int score = target[0] + target[1];
        for (int i = 0; i < incent.size(); i++) {
            int[] sc = incent.get(i);
            if (sc[0]+sc[1] > score) answer++;
        }
        return answer;
    }
}