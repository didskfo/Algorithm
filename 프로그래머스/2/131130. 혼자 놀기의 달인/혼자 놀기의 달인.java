import java.util.*;

class Solution {
    public int solution(int[] cards) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        boolean[] visit = new boolean[cards.length];
        for (int i = 0; i < cards.length; i++) {
            if (visit[i]) continue;
            int cnt = 0;
            int cur = i;
            while (!visit[cur]) {
                cnt++;
                visit[cur] = true;
                cur = cards[cur]-1;
            }
            
            list.add(cnt);
        }
        
        if (list.size() < 2) return 0;
        
        Collections.sort(list, Collections.reverseOrder());
        answer = list.get(0) * list.get(1);
        return answer;
    }
}