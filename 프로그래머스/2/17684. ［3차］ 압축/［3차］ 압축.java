import java.util.*;

class Solution {
    public int[] solution(String msg) {
        HashMap<String, Integer> dic = new HashMap<>();
        char c = 'A';
        for (int i = 1; i <= 26; i++) {
            dic.put(Character.toString(c), i);
            c++;
        }
        int num = 27;
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        for (int i = 0; i < msg.length(); ) {
            int j = i+1;
            int idx = -1;
            while (j <= msg.length() && dic.containsKey(msg.substring(i, j))) {
                idx = dic.get(msg.substring(i, j));
                j++;
            }
            
            ans.add(idx);
            
            if (j <= msg.length()) {
                dic.put(msg.substring(i, j), num++);
            }
            
            i = j-1;
        }
        
        return ans.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}