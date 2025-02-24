import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        int answer = 0;
        ArrayList<int[]> list = new ArrayList<>();
        for (int[] route : routes){
            list.add(route);
        }
        Collections.sort(list, (l1 , l2) -> Integer.compare(l1[1], l2[1]));
        while(!list.isEmpty()){
            int end = list.get(0)[1];
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i)[0] <= end) {
                    list.remove(i);
                    i--;
                }
            }
            answer++;
        }
        return answer;
    }
}