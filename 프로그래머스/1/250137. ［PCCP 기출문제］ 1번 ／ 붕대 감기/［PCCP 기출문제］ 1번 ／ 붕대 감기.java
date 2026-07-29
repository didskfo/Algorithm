import java.util.*;

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int t = bandage[0];
        int x = bandage[1];
        int y = bandage[2];
        int max = health;
        int cur = 0;
        
        for (int[] attack : attacks) {
            int time = attack[0] - cur - 1;
            if (time > 0) {
                int h = time*x + (time/t)*y;
                health = Math.min(max, health+h);
            }
            
            health -= attack[1];
            if (health <= 0) return -1;
            
            cur = attack[0];
        }
        return health;
    }
}