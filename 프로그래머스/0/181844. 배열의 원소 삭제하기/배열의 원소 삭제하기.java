import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        Integer[] deleteListInteger = Arrays.stream(delete_list).boxed().toArray(Integer[]::new);
        int[] answer = Arrays.stream(arr)
            .filter(i -> !(Arrays.asList(deleteListInteger).contains(i)))
            .toArray();
        return answer;
    }
}