class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        int lenX = park.length;
        int lenY = park[0].length();
        int curX = -1;
        int curY = -1;
        for (int i = 0; i < lenX; i++) {
            for (int j = 0; j < lenY; j++) {
                if (park[i].charAt(j) == 'S') {
                    curX = i;
                    curY = j;
                }
            }
        }
        for (String route : routes) {
            String[] order = route.split(" ");
            int len = Integer.parseInt(order[1]);
            boolean check = true;
            if (order[0].equals("E")) {
                if (curY+len < lenY) {
                    for (int i = 1; i <= len; i++) {
                        if (park[curX].charAt(curY+i) == 'X') {
                            check = false;
                            break;
                        }
                    }
                    if (check) curY += len;
                }
            } else if (order[0].equals("S")) {
                if (curX+len < lenX) {
                    for (int i = 1; i <= len; i++) {
                        if (park[curX+i].charAt(curY) == 'X') {
                            check = false;
                            break;
                        }
                    }
                    if (check) curX += len;
                }
            } else if (order[0].equals("W")) {
                if (curY-len >= 0) {
                    for (int i = 1; i <= len; i++) {
                        if (park[curX].charAt(curY-i) == 'X') {
                            check = false;
                            break;
                        }
                    }
                    if (check) curY -= len;
                }
            } else {
                if (curX-len >= 0) {
                    for (int i = 1; i <= len; i++) {
                        if (park[curX-i].charAt(curY) == 'X') {
                            check = false;
                            break;
                        }
                    }
                    if (check) curX -= len;
                }
            }
        }
        answer[0] = curX;
        answer[1] = curY;
        return answer;
    }
}