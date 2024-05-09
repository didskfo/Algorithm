import java.util.*;

class Solution {
    public int solution(String word) {
        int answer = 0;
        int[] cnt = {781, 156, 31, 6, 1};
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 0);
        map.put("E", 1);
        map.put("I", 2);
        map.put("O", 3);
        map.put("U", 4);
        
        String[] arr = word.split("");
        answer += arr.length;
        
        int i = 0;
        for (String a : arr) {
            answer += cnt[i++]*map.get(a);
        }
        
        return answer;
    }
}