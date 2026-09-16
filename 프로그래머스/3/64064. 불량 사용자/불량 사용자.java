import java.util.*;

class Solution {
    static Set<Set<String>> result = new HashSet<>();
    public int solution(String[] user_id, String[] banned_id) {
        dfs(0, user_id, banned_id, new HashSet<>());
        return result.size();
    }
    
    static void dfs(int depth, String[] user_id, String[] banned_id, Set<String> selected) {
        if (depth == banned_id.length) {
            result.add(new HashSet<>(selected));
            return;
        }
        
        for (String user : user_id) {
            if (selected.contains(user)) continue;
            if (!same(banned_id[depth], user)) continue;
            
            selected.add(user);
            dfs(depth+1, user_id, banned_id, selected);
            selected.remove(user);
        }
    }
    
    static boolean same(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '*') continue;
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }
}