class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        char[] be = before.toCharArray();
        char[] af = after.toCharArray();
        for (int i = 0; i < be.length; i++) {
            for (int j = 0; j < af.length; j++) {
                if (be[i] == af[j]) {
                    be[i] = '0';
                    af[j] = '1';
                    break;
                }
            }
        }
        for (int i = 0; i < be.length; i++) {
            if (be[i] != '0') {
                return 0;
            } 
        }
        return 1;
    }
}