import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> que1 = new PriorityQueue<>();
        PriorityQueue<Integer> que2 = new PriorityQueue<>(Collections.reverseOrder());
        for (String operation : operations) {
            String[] str = operation.split(" ");
            if (str[0].equals("I")) {
                que1.offer(Integer.parseInt(str[1]));
                que2.offer(Integer.parseInt(str[1]));
            } else {
                if (!que1.isEmpty() && Integer.parseInt(str[1]) == 1) {
                    int max = que2.poll();
                    que1.remove(max);
                } else if (!que1.isEmpty()){
                    int min = que1.poll();
                    que2.remove(min);
                }
            }
        }
        if (que1.isEmpty()) return new int[]{0, 0};
        else return new int[]{que2.poll(), que1.poll()};
    }
}