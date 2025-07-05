import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();
        int len = players.length;
        for (int i = 0; i < len; i++) {
            map.put(players[i], i);
        }
        for (String call : callings) {
            int idx = map.get(call);
            String player = players[idx-1];
            players[idx-1] = call;
            players[idx] = player;
            map.put(call, idx-1);
            map.put(player, idx);
        }
        
        return players;
    }
}