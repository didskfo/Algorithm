import java.util.*;

class Solution {
    public String[] solution(String[] s) {
        String[] answer = new String[s.length];
        for (int i = 0; i < s.length; i++) {
            StringBuilder sb = new StringBuilder();
            int cnt = 0;
            String str = s[i];
            
            for (char c : str.toCharArray()) {
                sb.append(c);
                int len = sb.length();
                
                if (len >= 3 && sb.charAt(len-3)=='1' && sb.charAt(len-2)=='1' && sb.charAt(len-1)=='0') {
                    sb.delete(len-3, len);
                    cnt++;
                }
            }
            
            int idx = sb.lastIndexOf("0");
            
            StringBuilder result = new StringBuilder();
            if (idx == -1) {
                for (int j = 0; j < cnt; j++) {
                    result.append("110");
                }
                result.append(sb);
            } else {
                result.append(sb.substring(0, idx+1));
                for (int j = 0; j < cnt; j++) {
                    result.append("110");
                }
                result.append(sb.substring(idx+1));
            }
            
            answer[i] = result.toString();
        }
        
        return answer;
    }
}