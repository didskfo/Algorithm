import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, Integer> time = new HashMap<>();
        
        for (String record : records) {
            String[] lst = record.split(" ");
            if (lst[2].equals("IN")) {
                map.put(lst[1], toMinute(lst[0]));
            } else {
                int start = map.remove(lst[1]);
                int end = toMinute(lst[0]);
                time.put(lst[1], time.getOrDefault(lst[1], 0)+end-start);
            }
        }
        
        int end = 23*60+59;
        
        for (String number : map.keySet()) {
            int start = map.get(number);
            time.put(number, time.getOrDefault(number, 0)+end-start);
        }
        
        List<String> cars = new ArrayList<>(time.keySet());
        Collections.sort(cars);
        
        int[] answer = new int[cars.size()];
        int idx = 0;
        for (String car : cars) {
            int min = time.get(car);
            if (min < fees[0]) {
                answer[idx++] = fees[1];
            } else {
                min -= fees[0];
                answer[idx++] = fees[1] + (min + fees[2] - 1)/fees[2]*fees[3];
            }
        }
        return answer;
    }
    
    static int toMinute(String str) {
        String[] lst = str.split(":");
        return Integer.parseInt(lst[0])*60 + Integer.parseInt(lst[1]);
    }
}