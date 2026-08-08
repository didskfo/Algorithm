import java.util.*;

class Solution {
    public int solution(String[][] book_time) {
        Arrays.sort(book_time, (a, b) ->
            Integer.compare(time(a[0]), time(b[0]))
        );
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (String[] book : book_time) {
            int start = time(book[0]);
            int end = time(book[1])+10;
            
            if (!pq.isEmpty() && pq.peek() <= start) {
                pq.poll();
            } 
            pq.offer(end);
        }
        return pq.size();
    }
    
    static int time(String a) {
        return Integer.parseInt(a.split(":")[0])*60 + Integer.parseInt(a.split(":")[1]);
    }
}