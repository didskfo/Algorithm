import java.util.ArrayList;
class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> arr = new ArrayList<>();
        for (String a : strArr) {
            if (!a.contains("ad")) arr.add(a);
        }
        String[] answer = arr.toArray(new String[0]);
        return answer;
    }
}