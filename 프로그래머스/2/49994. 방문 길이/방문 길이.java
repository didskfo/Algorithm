import java.util.*;
class Solution {
    public int solution(String dirs) {
        int x = 0; int y = 0; int cnt = 0;
        char[] arr = dirs.toCharArray();
        Set<String> visited = new HashSet<>();
        
        for (char c : arr) {
            int nx = x, ny = y;
            switch (c) {
              case 'U': if (y < 5) ny++; break;
              case 'D': if (y > -5) ny--; break;
              case 'R': if (x < 5) nx++; break;
              case 'L': if (x > -5) nx--; break;
            }
            
            if (nx != x || ny != y) {
                String path1 = x+" "+y+" "+nx+" "+ny;
                String path2 = nx+" "+ny+" "+x+" "+y;
                if (!visited.contains(path1)) {
                    visited.add(path1);
                    visited.add(path2);
                    cnt++;
                }
                x = nx;  y = ny;
            }
        }
        return cnt;
    }
}