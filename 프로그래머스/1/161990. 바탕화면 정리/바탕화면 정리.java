class Solution {
    public int[] solution(String[] wallpaper) {
        int maxX = wallpaper.length;
        int maxY = wallpaper[0].length();
        int x1 = maxX; int x2 = 0;
        int y1 = maxY; int y2 = 0;
        for (int i = 0; i < maxX; i++) {
            for (int j = 0; j < maxY; j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    x1 = Math.min(x1, i);
                    y1 = Math.min(y1, j);
                    x2 = Math.max(x2, i+1);
                    y2 = Math.max(y2, j+1);
                }
            }
        }
        return new int[]{x1, y1, x2, y2};
    }
}