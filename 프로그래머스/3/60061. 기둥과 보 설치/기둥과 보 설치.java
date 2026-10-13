import java.util.*;

class Solution {
    static boolean[][] pillar;
    static boolean[][] beam;
    public int[][] solution(int n, int[][] build_frame) {
        pillar = new boolean[n+2][n+2];
        beam = new boolean[n+2][n+2];
        
        for (int[] build : build_frame) {
            int x = build[0];
            int y = build[1];
            int a = build[2];
            int b = build[3];
            
            if (b == 1) {
                if (a == 0) {
                    pillar[x][y] = true;
                    if (!check(n)) {
                        pillar[x][y] = false;
                    }
                } else {
                    beam[x][y] = true;
                    if (!check(n)) {
                        beam[x][y] = false;
                    }
                }
            } else {
                if (a == 0) {
                    pillar[x][y] = false;
                    if (!check(n)) {
                        pillar[x][y] = true;
                    }
                } else {
                    beam[x][y] = false;
                    if (!check(n)) {
                        beam[x][y] = true;
                    }
                }
            }
        }
        
        List<int[]> result = new ArrayList<>();
        
        for (int x = 0; x <= n; x++) {
            for (int y = 0; y <= n; y++) {
                if (pillar[x][y]) {
                    result.add(new int[]{x, y, 0});
                }
                
                if (beam[x][y]) {
                    result.add(new int[]{x, y, 1});
                }
            }
        }
        return result.toArray(new int[result.size()][]);
    }
    
    static boolean check(int n) {
        for (int x = 0; x <= n; x++) {
            for (int y = 0; y <= n; y++) {
                if (pillar[x][y] && !checkPillar(x, y)) {
                    return false;
                }
                
                if (beam[x][y] && !checkBeam(x, y)) {
                    return false;
                }
            }
        }
        
        return true;
    }
    
    static boolean checkPillar(int x, int y) {
        if (y == 0) return true;
        if (pillar[x][y-1]) return true;
        if (x > 0 && beam[x-1][y]) return true;
        if (beam[x][y]) return true;
        
        return false;
    }
    
    static boolean checkBeam(int x, int y) {
        if (y > 0 && pillar[x][y-1]) return true;
        if (y > 0 && pillar[x+1][y-1]) return true;
        if (x > 0 && beam[x-1][y] && beam[x+1][y]) return true;
        
        return false;
    }
}