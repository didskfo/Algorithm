import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = {0, 0};
        PriorityQueue<Integer> que1 = new PriorityQueue<>();
        PriorityQueue<Integer> que2 = new PriorityQueue<Integer>(Collections.reverseOrder());
        int max, min;
        
        for (String operation : operations) {
            String[] arr = operation.split(" ");
            if (arr[0].equals("I")) {
                que1.add(Integer.parseInt(arr[1]));
                que2.add(Integer.parseInt(arr[1]));
            } else if(!que1.isEmpty() && arr[0].equals("D") && arr[1].equals("1")) {
                max = que2.poll();
                que1.remove(max);
            } else if (!que1.isEmpty() && arr[0].equals("D") && arr[1].equals("-1")){
                min = que1.poll();
                que2.remove(min);
            }
        }
        
        if (!que1.isEmpty()) {
            answer[0] = que2.poll();
            answer[1] = que1.poll();
        } 
        return answer;
    }
}