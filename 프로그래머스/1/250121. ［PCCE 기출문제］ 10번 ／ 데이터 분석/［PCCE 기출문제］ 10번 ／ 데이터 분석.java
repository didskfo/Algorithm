import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        ArrayList<int[]> lst = new ArrayList<>();
        int idx = -1;
        if (ext.equals("code")) idx = 0;
        else if (ext.equals("date")) idx = 1;
        else if (ext.equals("maximum")) idx = 2;
        else idx = 3;
        
        for (int i = 0; i < data.length; i++) {
            if (data[i][idx] < val_ext) lst.add(data[i]);
        }
        
        int sort_idx = -1;
        if (sort_by.equals("code")) sort_idx = 0;
        else if (sort_by.equals("date")) sort_idx = 1;
        else if (sort_by.equals("maximum")) sort_idx = 2;
        else sort_idx = 3;
        
        final int sortIdx = sort_idx;
        
        lst.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return a[sortIdx] - b[sortIdx];
            }
        });
        
        return lst.toArray(new int[0][]);
    }
}