class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        for (int i = 1; i <= Math.sqrt(yellow); i++) {
            System.out.println(i);
            if (yellow % i == 0) { 
                int yHeight = i;
                int yWidth = yellow / i;
                
                int carpetWidth = yWidth + 2;
                int carpetHeight = yHeight + 2;
                
                if ((carpetWidth * 2) + (yHeight * 2) == brown) {
                    answer[0] = carpetWidth;
                    answer[1] = carpetHeight;
                    return answer; 
                }
            }
        }
        return answer;
    }
}