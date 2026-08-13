import java.util.*;

class Solution {
    public String solution(String new_id) {
        new_id = new_id.toLowerCase();
        
        StringBuilder sb = new StringBuilder();
        boolean prevDot = false;
        
        for (int i = 0; i < new_id.length(); i++) {
            char c = new_id.charAt(i);
            if (!((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == '-' || c == '_' || c == '.')) continue;
            
            if (c == '.') {
                if (prevDot) continue;
                prevDot = true;
            } else {
                prevDot = false;
            }
            
            sb.append(c);
        }
        
        if (sb.length() > 0 && sb.charAt(0) == '.') sb.deleteCharAt(0);
        if (sb.length() > 0 && sb.charAt(sb.length()-1) == '.') sb.deleteCharAt(sb.length()-1);
        
        if (sb.length() == 0) sb.append('a');
        
        if (sb.length() >= 16) {
            sb.setLength(15);
            if (sb.charAt(14) == '.') sb.deleteCharAt(14);
        }
        
        while (sb.length() < 3) {
            sb.append(sb.charAt(sb.length()-1));
        }
        
        return sb.toString();
    }
}