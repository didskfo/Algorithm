import java.util.*;
class Solution {
    static int answer = 0;
    public int solution(int[] wallet, int[] bill) {
        Arrays.sort(wallet);
        Arrays.sort(bill);
        while (wallet[0] < bill[0] || wallet[1] < bill[1]) {
            bill = pold(bill);
            Arrays.sort(bill);
        }
        return answer;
    }
    
    static int[] pold(int[] bill) {
        if (bill[0] > bill[1]) {
            bill[0] = bill[0] / 2;
            answer++;
            return bill;
        } else {
            bill[1] = bill[1] / 2;
            answer++;
            return bill;
        }
    }
}