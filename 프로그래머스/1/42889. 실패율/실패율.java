import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] failCnt = new int[N];
        
        for (int s : stages) {
            if (s != N+1) {
                failCnt[s-1]++;
            }
        }
        
        int people = stages.length;
        HashMap<Integer, Double> map = new HashMap<>();
        
        for (int i = 0; i < N; i++) {
            if (people <= 0) {
                map.put(i+1, (double)0);
                continue;
            }
            
            map.put(i+1, (double)failCnt[i]/people);
            people -= failCnt[i];
        }
        
        List<Integer> keySet = new ArrayList<>(map.keySet());
        Collections.sort(keySet, (o1, o2) -> (map.get(o2).compareTo(map.get(o1))));
        int idx = 0;
        for (int key : keySet) {
            answer[idx++] = key;
        }
        return answer;
    }
}