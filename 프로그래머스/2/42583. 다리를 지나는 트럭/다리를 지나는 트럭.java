import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int sum = 0;
        Deque<Integer> que = new ArrayDeque<>();
        Deque<Integer> bri = new ArrayDeque<>();
        for (int i : truck_weights) que.add(i);
        Integer[] init = new Integer[bridge_length-1];
        Arrays.fill(init, 0);
        bri.addAll(Arrays.asList(init));
        while (!que.isEmpty()) {
            sum += que.peek();
            if (sum <= weight) bri.add(que.poll());
            else {
                sum -= que.peek();
                bri.add(0);
            }
            sum -= bri.poll();
            answer += 1;
        }
        return answer+bri.size()+1;
    }
}