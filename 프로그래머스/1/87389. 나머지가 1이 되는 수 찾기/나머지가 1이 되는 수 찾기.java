class Solution {
    public int solution(int n) {
        int num = 2;
        while (n % num != 1) {
            num += 1;
        }
        return num;
    }
}