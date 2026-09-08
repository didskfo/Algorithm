import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        PriorityQueue<Integer> que1 = new PriorityQueue<>();
        PriorityQueue<Integer> que2 = new PriorityQueue<>(Collections.reverseOrder());
        for (String oper : operations) {
            String[] str = oper.split(" ");
            if (str[0].equals("I")) {
                que1.offer(Integer.parseInt(str[1]));
                que2.offer(Integer.parseInt(str[1]));
            } else if (str[1].equals("1")) {
                que1.remove(que2.poll());
            } else {
                que2.remove(que1.poll());
            }
        }
        
        if (que1.isEmpty()) return new int[]{0, 0};
        answer[0] = que2.peek();
        answer[1] = que1.peek();
        return answer;
    }
}