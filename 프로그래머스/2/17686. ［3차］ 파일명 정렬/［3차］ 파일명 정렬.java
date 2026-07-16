import java.util.*;

class File {
    int idx;
    String head;
    int number;
    
    File(int idx, String head, int number) {
        this.idx = idx;
        this.head = head;
        this.number = number;
    }
}

class Solution {
    public String[] solution(String[] files) {
        int n = files.length;
        String[] answer = new String[n];
        
        ArrayList<File> list = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            String file = files[i];
            int idx = 0;
            
            while (!Character.isDigit(file.charAt(idx))) {
                idx++;
            }
            
            String head = file.substring(0, idx);
            int start = idx;
            
            while (idx < file.length() && Character.isDigit(file.charAt(idx))) {
                idx++;
            }
            
            String number = file.substring(start, idx);
            list.add(new File(i, head.toLowerCase(), Integer.parseInt(number)));
        }
        
        Collections.sort(list, new Comparator<File>() {
            @Override
            public int compare(File f1, File f2) {
                return f1.head.equals(f2.head) ? (f1.number == f2.number ? f1.idx - f2.idx : f1.number - f2.number) : f1.head.compareTo(f2.head);
            }
        });
        
        for (int i = 0; i < n; i++) {
            answer[i] = files[list.get(i).idx];
        }
        return answer;
    }
}