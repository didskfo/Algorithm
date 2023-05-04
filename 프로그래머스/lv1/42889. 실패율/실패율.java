import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] fail = new int[N];
        double[] fail_rate = new double[N];
        Map<Integer, Double> map = new HashMap<>();
        for (int i : stages) {
            if (i != N+1) {
                fail[i-1]++;
            }
        }
        int peo = stages.length;
        for (int i = 0; i < N; i++) {
            if (peo <= 0) {
                fail_rate[i] = 0;
                map.put(i+1, fail_rate[i]);
                continue;
            }
            fail_rate[i] = (double)fail[i] / peo;
            peo -= fail[i];
            map.put(i+1, fail_rate[i]);
        }
        List<Integer> keySet = new ArrayList<>(map.keySet());
        Collections.sort(keySet, (value1, value2) -> (map.get(value2).compareTo(map.get(value1))));
		int idx = 0;
        for (int key : keySet) {
            answer[idx++] = key;
        }
        return answer;
    }
}