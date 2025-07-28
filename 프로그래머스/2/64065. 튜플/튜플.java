import java.util.*;
class Solution {
    public int[] solution(String s) {
        String body = s.substring(2, s.length() - 2);
        String[] groups = body.split("\\},\\{");
        List<List<Integer>> lst = new ArrayList<>();
        for (String grp : groups) {
            String[] tokens = grp.split(",");
            List<Integer> row = new ArrayList<>(tokens.length);
            for (String tok : tokens) {
                row.add(Integer.valueOf(tok));
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