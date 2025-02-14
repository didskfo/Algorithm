import java.util.*;

class Solution {
    static class Song {
        int play;
        int num;
        public Song (int play, int num) {
            this.play = play;
            this.num = num;
        }
    }
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String, ArrayList<Song>> map = new HashMap<>();
        HashMap<String, Integer> count = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            map.computeIfAbsent(genres[i], k -> new ArrayList<>()).add(new Song(plays[i], i));
            count.put(genres[i], count.getOrDefault(genres[i], 0)+plays[i]);
        }
        int[] cnt = new int[count.size()];
        ArrayList<Integer> answer = new ArrayList<>();
        List<String> keySet = new ArrayList<>(count.keySet());
        keySet.sort((c1, c2) -> count.get(c2).compareTo(count.get(c1)));
        for (String key : keySet) {
            ArrayList<Song> list = map.get(key);
            if (list.size() < 2) answer.add(list.get(0).num);
            else {
                list.sort((l1, l2) -> l2.play - l1.play);
                answer.add(list.get(0).num);
                answer.add(list.get(1).num);
            }
        }
        return answer.stream().mapToInt(i->i).toArray();
    }
}