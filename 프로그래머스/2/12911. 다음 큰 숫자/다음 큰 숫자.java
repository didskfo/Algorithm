class Solution {
    public int solution(int n) {
        String str = Integer.toBinaryString(n);
        int cnt = count(str);
        int number = n+1;
        while (true) {
            if (count(Integer.toBinaryString(number)) == cnt) {
                break;
            } 
            number++;
        }
        return number;
    }
    
    static int count(String str) {
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') cnt++;
        }
        return cnt;
    }
}