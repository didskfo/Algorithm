class Solution {
    public int[] solution(String s) {
        int cnt = 0;
        int zero = 0;
        
        while (!s.equals("1")) {
            cnt++;
            
            int len = s.length();
            s = s.replace("0", "");
            int n = s.length();
            zero += len - n;
            s = Integer.toBinaryString(n);
        }
        return new int[]{cnt, zero};
    }
}