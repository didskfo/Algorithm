import java.util.*;

class Solution {
    public int[] solution(String s) {
        s = s.substring(2, s.length()-2);
        String[] list = s.split("\\},\\{");
        List<List<Integer>> lst = new ArrayList<>();
        for (String str : list) {
            String[] tuple = str.split(",");
            List<Integer> row = new ArrayList<>(tuple.length);
            
            for (String t : tuple) {
                row.add(Integer.parseInt(t));
            }
            
            lst.add(row);
        }
        
        lst.sort(Comparator.comparingInt(List::size));
        Set<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < lst.size(); i++) {
            List<Integer> l = lst.get(i);
            for (int j = 0; j < l.size(); j++) {
                set.add(l.get(j));
            }
        }
        
        int[] answer = set.stream()
            .mapToInt(Integer::intValue)
            .toArray();
        return answer;
    }
}