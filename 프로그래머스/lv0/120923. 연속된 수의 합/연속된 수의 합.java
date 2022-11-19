class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        if (num % 2 != 0) {
            answer[num/2] = total / num;
            int a = 1;
            for (int i = (num/2)-1; i >= 0; i--) {
                answer[i] = total/num - a;
                a++;
            }
            int b = 1;
            for (int i = (num/2)+1; i < num; i++) {
                answer[i] = total/num + b;
                b++;
            }
        } else {
            answer[num/2-1] = total / num;
            int a = 1;
            for (int i = num/2-2; i >= 0; i--) {
                answer[i] = total/num - a;
                a++;
            }
            int b = 1;
            for (int i = num/2; i < num; i++) {
                answer[i] = total/num + b;
                b++;
            }
        }
        
        return answer;
    }
}