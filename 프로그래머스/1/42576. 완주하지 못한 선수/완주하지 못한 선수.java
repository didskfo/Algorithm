import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> comp = new HashMap<>();
        for (String com : completion) {
            comp.put(com, comp.getOrDefault(com, 0)+1);
        }
        for (String par : participant) {
            int cnt = comp.getOrDefault(par, 0);
            comp.put(par, cnt-1);
            if (comp.get(par) == -1) return par;
        }
        return "";
    }
}