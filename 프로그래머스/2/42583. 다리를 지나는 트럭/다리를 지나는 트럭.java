import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Deque<Integer> truck = new ArrayDeque<>();
        Deque<Integer> bridge = new ArrayDeque<>(Collections.nCopies(bridge_length-1, 0));
        for (int t : truck_weights) {
            truck.offer(t);
        }
        
        int wei = 0;
        while (!truck.isEmpty()) {
            wei += truck.peek();
            if (wei > weight) {
                wei -= truck.peek();
                bridge.offer(0);
            } else {
                bridge.offer(truck.poll());
            }
            wei -= bridge.poll();
            answer++;
        }
        return answer+bridge.size()+1;
    }
}