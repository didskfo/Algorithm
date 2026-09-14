import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        Set<String> set = new HashSet<>(Arrays.asList(genres));
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            map.put(genres[i], map.getOrDefault(genres[i], 0)+plays[i]);
        }
        
        List<String> keySet = new ArrayList<>(map.keySet());
        keySet.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));
        
        List<Integer> ans = new ArrayList<>();
        
        for (String key : keySet) {
            List<Integer> songs = new ArrayList<>();
            
            for (int i = 0; i < genres.length; i++) {
                if (genres[i].equals(key)) {
                    songs.add(i);
                }
            }
            
            songs.sort((a, b) -> {
                if (plays[a] == plays[b]) {
                    return a - b;
                } else {
                    return plays[b] - plays[a];
                }
            });
            
            ans.add(songs.get(0));
            if (songs.size() > 1) {
                ans.add(songs.get(1));
            }
        }
        
        int[] answer = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            answer[i] = ans.get(i);
        }
        return answer;
    }
}