import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        String[] todayDate = today.split("\\.");
        int todayYear = Integer.parseInt(todayDate[0]);
        int todayMonth = Integer.parseInt(todayDate[1]);
        int todayDay = Integer.parseInt(todayDate[2]);
        
        List<Integer> answer = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (String term : terms) {
            String[] str = term.split(" ");
            map.put(str[0], Integer.parseInt(str[1]));
        }
        
        for (int i = 0; i < privacies.length; i++) {
            String[] lst = privacies[i].split(" ");
            String[] date = lst[0].split("\\.");
            int due = map.get(lst[1]);
            int year = Integer.parseInt(date[0]);
            int month = Integer.parseInt(date[1]) + due;
            int day = Integer.parseInt(date[2]);        
            while (month > 12) {
                year++;
                month -= 12;
            }
            if (year > todayYear) {
                continue;
            } else if (year == todayYear && month > todayMonth) {
                continue;
            } else if (year == todayYear && month == todayMonth && day > todayDay) {
                continue;
            } else {
                answer.add(i+1);
            }
        }
        return answer.stream()
             .mapToInt(Integer::intValue)  
             .toArray();
    }
}