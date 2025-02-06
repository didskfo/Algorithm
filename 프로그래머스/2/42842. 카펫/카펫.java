class Solution {
    public int[] solution(int brown, int yellow) {     
        for (int i = 1; i <= yellow; i++) {
            if (yellow % i == 0) {
                int wid = yellow/i + 2;
                int hei = i + 2;
                if (wid * hei == brown + yellow) {
                    return new int[]{wid, hei};
                }
            }
        }
        return new int[]{0, 0};
    }
}