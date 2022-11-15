import java.util.*;
class Solution {
    public int solution(int a, int b) {
        int max = 1; 
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                max = i;
            }
        }
        a = a / max;
        b = b / max;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 2; i <= b; i++) {
            while (b % i == 0) {
                arr.add(i);
                b = b / i;
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) != 2 && arr.get(i) != 5) {
                return 2;
            }
        }
        return 1;
    }
}