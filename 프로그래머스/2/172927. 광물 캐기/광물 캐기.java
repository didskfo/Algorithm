import java.util.*;

class Solution {
    public int solution(int[] picks, String[] minerals) {
        int answer = 0;
        int maxCount = Math.min(minerals.length, (picks[0]+picks[1]+picks[2])*5);
        
        List<int[]> groupTired = new ArrayList<>();
        for (int i = 0; i < maxCount; i+=5) {
            int dia = 0;
            int iron = 0;
            int stone = 0;
            for (int j = i; j < i+5 && j < maxCount; j++) {
                if (minerals[j].equals("diamond")) dia++;
                else if (minerals[j].equals("iron")) iron++;
                else stone++;
            }
            
            int tired = dia*25 + iron*5 + stone;
            groupTired.add(new int[]{tired, dia, iron, stone});
        }
        
        groupTired.sort((a, b) -> Integer.compare(b[0], a[0]));
        
        int idx = 0;
        for (int i = 0; i < picks[0] && idx < groupTired.size(); i++) {
            int[] group = groupTired.get(idx);
            idx++;
            answer += group[1] + group[2] + group[3];
        }
        
        for (int i = 0; i < picks[1] && idx < groupTired.size(); i++) {
            int[] group = groupTired.get(idx);
            idx++;
            answer += group[1]*5 + group[2] + group[3];
        }
        
        for (int i = 0; i < picks[2] && idx < groupTired.size(); i++) {
            int[] group = groupTired.get(idx);
            idx++;
            answer += group[1]*25 + group[2]*5 + group[3];
        }
        
        return answer;
    }
}