import java.util.*;

class Solution {
    public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        int[] answer = new int[enroll.length];
        HashMap<String, String> parent = new HashMap<>();
        HashMap<String, Integer> money = new HashMap<>();
        for (int i = 0; i < enroll.length; i++) {
            parent.put(enroll[i], referral[i]);
        }
        
        for (int i = 0; i < seller.length; i++) {
            int m = amount[i]*100;
            String name = seller[i];
            while (!name.equals("-") && m > 0) {
                money.put(name, money.getOrDefault(name, 0)+m-m/10);
                name = parent.get(name);
                m = m/10;
            }
        }
        
        for (int i = 0; i < enroll.length; i++) {
            answer[i] = money.getOrDefault(enroll[i], 0);
        }
        return answer;
    }
}