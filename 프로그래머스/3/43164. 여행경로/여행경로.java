import java.util.*;

class Solution {
    static boolean[] visit;
    static ArrayList<String> list = new ArrayList<>();
    public String[] solution(String[][] tickets) {
        visit = new boolean[tickets.length];
        dfs(0, "ICN", "ICN", tickets);
        Collections.sort(list);
        return list.get(0).split(" ");
    }
    
    static void dfs(int cnt, String start, String end, String[][] tickets) {
        if (cnt == tickets.length) {
            list.add(end);
            return;
        }
        for (int i = 0; i < tickets.length; i++) {
            if (tickets[i][0].equals(start) && !visit[i]) {
                visit[i] = true;
                dfs(cnt+1, tickets[i][1], end+" "+tickets[i][1], tickets);
                visit[i] = false;
            }
        }
    }
}