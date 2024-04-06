class Solution {
    boolean solution(String s) {
        s = s.toLowerCase();
        long p = s.chars()
            .filter(c -> c == 'p')
            .count();
        long y = s.chars()
            .filter(c -> c == 'y')
            .count();
        return p==y ? true : false;
    }
}