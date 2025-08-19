class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        int len = sequence.length;
        int min = Integer.MAX_VALUE;
        int left = 0, sum = 0;
        
        for (int right = 0; right < len; right++) {
            sum += sequence[right];
            
            while (sum >= k && left <= right) {
                if (sum == k && min > right-left+1) {
                    min = right-left+1;
                    answer[0] = left;
                    answer[1] = right;
                } 
                sum -= sequence[left++];
            }
        }
        return answer;
    }
}