import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<String, Integer> total = new HashMap<>();
        HashMap<String, HashMap<Integer, Integer>> music = new HashMap<>();
        
        for (int i = 0; i < genres.length; i++) {
            if (total.containsKey(genres[i])) {
                total.put(genres[i], total.get(genres[i])+plays[i]);
                music.get(genres[i]).put(i, plays[i]);
            } else {
                total.put(genres[i], plays[i]);
                HashMap<Integer, Integer> map = new HashMap<>();
                map.put(i, plays[i]);
                music.put(genres[i], map);
            }
        }
        
        List<String> keySet = new ArrayList<>(total.keySet());
        Collections.sort(keySet, (k1, k2) -> total.get(k2) - total.get(k1));
        
        for (String key : keySet) {
            HashMap<Integer, Integer> map = music.get(key);
            List<Integer> key_idx = new ArrayList<>(map.keySet());
            Collections.sort(key_idx, (k1, k2) -> map.get(k2) - map.get(k1));
            
            if (key_idx.size() > 1) {
                answer.add(key_idx.get(0));
                answer.add(key_idx.get(1));
            } else {
                answer.add(key_idx.get(0));
            }
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}