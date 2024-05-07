import java.util.*;

public class Solution {
    public int solution(int k, int[][] dungeons) {
        int answer = -1;
        int cnt; int ph;
        Integer[][] dungeonsInteger = new Integer[dungeons.length][];
        for (int i = 0; i < dungeons.length; i++) {
            dungeonsInteger[i] = Arrays.stream(dungeons[i]).boxed().toArray(Integer[]::new);
        }

        List<Integer[][]> permutations = generatePermutations(dungeonsInteger);

        for (Integer[][] perm : permutations) {
            cnt = 0;
            ph = k;
            for (Integer[] per : perm) {
                if (ph >= per[0]) {
                    cnt++;
                    ph -= per[1];
                }
            }
            if (answer < cnt) answer = cnt;
        }
        return answer;
    }

    public static <T> List<T[][]> generatePermutations(T[][] twoDimArray) {
        List<T[][]> result = new ArrayList<>();
        permute(twoDimArray, 0, result);
        return result;
    }

    private static <T> void permute(T[][] arr, int index, List<T[][]> result) {
        if (index == arr.length - 1) {
            result.add(cloneArray(arr));
            return;
        }

        for (int i = index; i < arr.length; i++) {
            swap(arr, index, i);
            permute(arr, index + 1, result);
            swap(arr, index, i);
        }
    }

    private static <T> void swap(T[][] arr, int i, int j) {
        T[] temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static <T> T[][] cloneArray(T[][] arr) {
        T[][] clone = arr.clone();
        for (int i = 0; i < arr.length; i++) {
            clone[i] = arr[i].clone();
        }
        return clone;
    }
}
