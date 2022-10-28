class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int sum = 0;
        for(int i = 0; i < nums.length-2; i++){
            for(int j = i+1; j < nums.length-1; j++){
                for(int k = j+1; k < nums.length; k++){
                    sum = nums[i] + nums[j] + nums[k];
                    int cnt = 0;
                    for(int n = 1; n < Math.round(Math.sqrt(sum))+1; n++){
                        if(sum % n == 0){
                            cnt++;
                        }
                    }
                    if(cnt <= 1){
                            answer++;
                        }
                }
            }
        }

        return answer;
    }
}