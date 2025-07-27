import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        List<String> lst = new ArrayList<>();
        for (String city : cities) {
            city = city.toLowerCase();
            int idx = lst.indexOf(city);
            if (idx != -1) {
                answer++;
                lst.remove(idx);
                lst.add(city);
            } else {
                answer+=5;
                if (cacheSize > 0) {
                    if (lst.size() < cacheSize) {
                        lst.add(city);
                    } else {
                        if (lst.size() > 0) lst.remove(0);
                        lst.add(city);
                    }
                }
            }
        }
        return answer;
    }
}