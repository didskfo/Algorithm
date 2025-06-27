import java.util.*;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        String[] str = {"code", "date", "maximum", "remain"};
        int extIdx = Arrays.asList(str).indexOf(ext);
        int sortIdx = Arrays.asList(str).indexOf(sort_by);
        ArrayList<int[]> list = new ArrayList<>();
        
        for (int[] d : data) {
            if (d[extIdx] < val_ext) {
                list.add(d);
            }
        }
        
        Collections.sort(list, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[sortIdx] - o2[sortIdx];
            }
        });
        
        int[][] answer = list.toArray(int[][]::new);
        return answer;
    }
}