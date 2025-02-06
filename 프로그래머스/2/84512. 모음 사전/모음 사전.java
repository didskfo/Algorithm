import java.util.*;

class Solution {
    public int solution(String word) {
        int answer = 0;
        String[] str = word.split("");
        int[] cnt = {781, 156, 31, 6, 1};
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 0);
        map.put("E", 1);
        map.put("I", 2);
        map.put("O", 3);
        map.put("U", 4);
        
        int idx = 0;
        for (String s : str) {
            answer += cnt[idx++]*map.get(s);
        }
        return answer+str.length;
    }
}