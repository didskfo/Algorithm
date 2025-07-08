class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int t = bandage[0];
        int x = bandage[1];
        int y = bandage[2];
        int max = health;
        int curr = 0;
        
        for (int[] attack : attacks) {
            int atk = attack[0];
            int dmg = attack[1];

            int time = atk - curr - 1;
            if (time > 0) {
                int heal = time * x + (time/t) * y;
                health = Math.min(max, health + heal);
            }

            health -= dmg;
            if (health <= 0) {
                return -1;       
            }

            curr = atk;
        }
        return health;
    }
}