class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int cnt_0 = 0;
        int cnt_a = 0;
        
        for(int i : lottos){
            if(i == 0){
                cnt_0++;
            }else{
                for(int j : win_nums){
                    if(j == i){
                        cnt_a++;
                        break;
                    }
                }
            }
        }
        int min = cnt_a;
        int max = cnt_a + cnt_0;
        answer[0] = Math.min(7-max, 6);
        answer[1] = Math.min(7-min, 6);
        return answer;
    }
}