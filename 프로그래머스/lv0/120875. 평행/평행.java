class Solution {
    public int solution(int[][] dots) {
        double x1 = dots[0][0];
        double x2 = dots[1][0];
        double x3 = dots[2][0];
        double x4 = dots[3][0];
        double y1 = dots[0][1];
        double y2 = dots[1][1];
        double y3 = dots[2][1];
        double y4 = dots[3][1];
        for (int i = 0; i < dots.length; i++) {
            if (i == 0) {
                double a = (y2-y1)/(x2-x1);
                double b = (y4-y3)/(x4-x3);
                if (a == b) {
            return 1;
        }
            } else if (i == 1) {
                double a = (y3-y1)/(x3-x1);
                double b = (y4-y2)/(x4-x2);
                if (a == b) {
            return 1;
        }
            } else {
                double a = (y4-y1)/(x4-x1);
                double b = (y3-y2)/(x3-x2);
                if (a == b) {
            return 1;
        }
            }
        }
        return 0;
    }
}