import java.util.*;

class Solution {
    public int solution(String dirs) {
        int answer = 0;
        int x = 0; int y = 0;
        Set<String> visited = new HashSet<>();
        char[] dir = dirs.toCharArray();
        
        for (char d : dir) {
            int nx = x;
            int ny = y;
            switch(d) {
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
                    answer++;
                }
                x = nx;
                y = ny;
            }
        }
        return answer;
    }
}