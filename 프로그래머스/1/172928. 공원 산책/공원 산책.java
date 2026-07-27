class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        int n = park.length;
        int m = park[0].length();
        char[][] map = new char[n][m];
        int curX = 0, curY = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = park[i].charAt(j);
                if (map[i][j] == 'S') {
                    curX = i;
                    curY = j;
                }
            }
        }
        
        for (String route : routes) {
            String[] r = route.split(" ");
            String dir = r[0];
            int dist = Integer.parseInt(r[1]);
            boolean check = true;
            
            if (dir.equals("N")) {
                if (curX-dist >= 0) {
                    for (int i = 1; i <= dist; i++) {
                        if (map[curX-i][curY] == 'X') {
                            check = false;
                            break;
                        }
                    }
                    if (check) {
                        curX -= dist;
                    }
                }
            } else if (dir.equals("S")) {
                if (curX+dist < n) {
                    for (int i = 1; i <= dist; i++) {
                        if (map[curX+i][curY] == 'X') {
                            check = false;
                            break;
                        } 
                    }
                    if (check) {
                        curX += dist;
                    }
                }
            } else if (dir.equals("W")) {
                if (curY-dist >= 0) {
                    for (int i = 1; i <= dist; i++) {
                        if (map[curX][curY-i] == 'X') {
                            check = false;
                            break;
                        }
                    }
                    if (check) {
                        curY -= dist;
                    }
                }
            } else {
                if (curY+dist < m) {
                    for (int i = 1; i <= dist; i++) {
                        if (map[curX][curY+i] == 'X') {
                            check = false;
                            break;
                        }
                    }
                    if (check) {
                        curY += dist;
                    }
                }
            }
        }
        answer[0] = curX;
        answer[1] = curY;
        return answer;
    }
}