import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        int answer = 0;
        ArrayList<int[]> lst = new ArrayList<>();
        for (int[] route : routes) {
            lst.add(route);
        }
        Collections.sort(lst, (o1, o2) -> o1[1] - o2[1]);
        
        while (!lst.isEmpty()) {
            int end = lst.get(0)[1];
            for (int i = 0; i < lst.size(); i++) {
                if(lst.get(i)[0] <= end) {
                    lst.remove(i);
                    i--;
                }
            }
            answer++;
        }
        return answer;
    }
}