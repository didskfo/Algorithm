import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        Map<String, Integer> in = new HashMap<>();
        Map<String, Integer> total = new HashMap<>();
        for (String record : records) {
            String[] str = record.split(" ");
            String car = str[1];
            int min = Integer.parseInt(str[0].split(":")[0]) * 60 + Integer.parseInt(str[0].split(":")[1]);
            if (str[2].equals("IN")) {
                in.put(car, min);
            } else {
                int time = in.remove(car);
                total.put(car, total.getOrDefault(car, 0) + min-time);
            }
        }
        int end = 23 * 60 + 59;
        for (Map.Entry<String, Integer> e : in.entrySet()) {
            String car = e.getKey();
            int start = e.getValue();
            total.put(car, total.getOrDefault(car, 0) + (end - start));
        }
        
        List<String> cars = new ArrayList<>(total.keySet());
        Collections.sort(cars);
        int[] answer = new int[cars.size()];
        int idx = 0;
        for (String car : cars) {
            int minutes = total.get(car);
            int fee = fees[1];
            if (minutes > fees[0]) {
                int extra = minutes - fees[0];
                int units = (extra + fees[2] - 1) / fees[2];
                fee += units * fees[3];
            }
            answer[idx++] = fee;
        }
        return answer;
    }
}