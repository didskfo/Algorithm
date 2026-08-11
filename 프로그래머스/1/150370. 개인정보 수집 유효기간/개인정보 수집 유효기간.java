import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        HashMap<String, Integer> term = new HashMap<>();
        for (String t : terms) {
            String[] str = t.split(" ");
            term.put(str[0], Integer.parseInt(str[1]));
        }
        
        String[] todayStr = today.split("\\.");
        int todayYear = Integer.parseInt(todayStr[0]);
        int todayMonth = Integer.parseInt(todayStr[1]);
        int todayDay = Integer.parseInt(todayStr[2]);
        int todayCount = todayYear*12*28+todayMonth*28+todayDay;
        
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < privacies.length; i++) {
            String[] pri = privacies[i].split(" ");
            String[] date = pri[0].split("\\.");
            int year = Integer.parseInt(date[0]);
            int month = Integer.parseInt(date[1]);
            int day = Integer.parseInt(date[2]);
            
            int due = term.get(pri[1]);
            month += due;
            
            int count = year*12*28+month*28+day;
            
            if (todayCount >= count) answer.add(i+1);
        }
        return answer.stream()
	        .mapToInt(Integer::intValue)
    	    .toArray();
    }
}