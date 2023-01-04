class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] arr = new int[number];
        for (int i = 1; i <= number; i++) {
            int count = 0;
            for (int j = 1; j * j <= i; j++) {
	            if (j * j == i) count++;
	            else if (i % j == 0) count += 2;
            arr[i-1] = count;
}
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > limit) {
                arr[i] = power;
            }
            answer += arr[i];
        }
        return answer;
    }
}