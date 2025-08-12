import java.util.*;
class Solution {
    static class Log {
        String uid;
        boolean enter; 
        Log(String uid, boolean enter) { this.uid = uid; this.enter = enter; }
    }
    
    public String[] solution(String[] record) {
        Map<String, String> map = new TreeMap<>();
        List<Log> lst = new ArrayList<>();
        
        for (String r : record) {
            String[] str = r.split(" ");
            
            if (str[0].equals("Change") || str[0].equals("Enter")) {
                map.put(str[1], str[2]);
            } 
            if (!str[0].equals("Change")) {
                lst.add(new Log(str[1], str[0].equals("Enter")?true:false));
            }
        }
        
        String[] answer = new String[lst.size()];
        int idx = 0;
        for (Log l : lst) {
            String nick = map.get(l.uid); 
            answer[idx++] = nick + (l.enter ? "님이 들어왔습니다." : "님이 나갔습니다.");
        }
        return answer;
    }
}