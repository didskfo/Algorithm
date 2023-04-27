class Solution {
    public int solution(int[] num_list) {
        int gob = 1;
        int sum = 0;
        for (int i = 0; i < num_list.length; i++) {
            gob*=num_list[i];
            sum+=num_list[i];
        }
        int answer = gob<Math.pow(sum, 2)?1:0;
        return answer;
    }
}