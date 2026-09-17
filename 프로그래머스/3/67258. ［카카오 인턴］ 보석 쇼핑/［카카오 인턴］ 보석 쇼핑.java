import java.util.*;

class Solution {
    public int[] solution(String[] gems) {
        Set<String> unique = new HashSet<>(Arrays.asList(gems));
        int cnt = unique.size();
        
        int start = 0;
        int end = 0;
        
        int min = Integer.MAX_VALUE;
        int answerStart = 0;
        int answerEnd = 0;
        
        HashMap<String, Integer> map = new HashMap<>();
        
        while (end < gems.length) {
            map.put(gems[end], map.getOrDefault(gems[end], 0) + 1);
            
            while (map.size() == cnt) {
                if (end - start + 1 < min) {
                    min = end - start + 1;
                    answerStart = start;
                    answerEnd = end;
                }
                
                map.put(gems[start], map.get(gems[start]) - 1);
                if (map.get(gems[start]) == 0) {
                    map.remove(gems[start]);
                }
                
                start++;
            }
            end++;
        }
        
        return new int[]{answerStart+1, answerEnd+1};
    }
}