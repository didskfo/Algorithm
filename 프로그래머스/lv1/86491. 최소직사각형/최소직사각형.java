class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max_h = 0;
        int max_v = 0;
        
        for(int i = 0; i < sizes.length; i++){
            if(sizes[i][1] > sizes[i][0]){
                int tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }
            if(sizes[i][0] > max_h){
                max_h = sizes[i][0];
            }
            if(sizes[i][1] > max_v){
                max_v = sizes[i][1];
            }
        }
        answer = max_v * max_h;
        
        return answer;
    }
}