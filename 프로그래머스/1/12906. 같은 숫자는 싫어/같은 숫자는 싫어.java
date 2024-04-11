import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int idx = 0;
        arrayList.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arrayList.get(idx) == arr[i]) continue;
            arrayList.add(arr[i]);
            idx++;
        }
        return arrayList.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}