import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        ArrayList<String> list = new ArrayList<>(Arrays.asList(id_list));
        
        HashMap<String, HashSet<String>> map = new HashMap<>();
        for (String r : report) {
            String[] lst = r.split(" ");
            String per1 = lst[0];
            String per2 = lst[1];
            map.putIfAbsent(per2, new HashSet<>());
            map.get(per2).add(per1);
        }
        
        for (String reported : map.keySet()) {
            HashSet<String> reporters = map.get(reported);
            if (reporters.size() >= k) {
                for (String reporter : reporters) {
                    answer[list.indexOf(reporter)]++;
                }
            }
        }
        return answer;
    }
}