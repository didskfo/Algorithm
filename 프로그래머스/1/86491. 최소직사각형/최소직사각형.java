class Solution {
    public int solution(int[][] sizes) {
        int wid_max = 0;
        int hei_max = 0;
        int wid;
        int hei;
        for (int[] size : sizes) {
            wid = size[0];
            hei = size[1];
            wid_max = Math.max(Math.max(wid, hei), wid_max);
            hei_max = Math.max(Math.min(wid, hei), hei_max);
        }
        return wid_max * hei_max;
    }
}