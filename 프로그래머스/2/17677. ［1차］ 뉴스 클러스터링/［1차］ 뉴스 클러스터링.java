import java.util.*;
class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        for (int i = 0; i < charArray1.length-1; i++) {
            char c1 = charArray1[i];
            char c2 = charArray1[i+1];
            if (Character.isAlphabetic(c1) && Character.isAlphabetic(c2)) {
                list1.add(new StringBuilder().append(c1).append(c2).toString());
            }
        }
        for (int i = 0; i < charArray2.length-1; i++) {
            char c1 = charArray2[i];
            char c2 = charArray2[i+1];
            if (Character.isAlphabetic(c1) && Character.isAlphabetic(c2)) {
                list2.add(new StringBuilder().append(c1).append(c2).toString());
            }
        }
        
        List<String> temp = new ArrayList<>(list2);
        int intersection = 0;
        for (String x : list1) {
            if (temp.remove(x)) {
                intersection++;
            }
        }
        int union = list1.size() + list2.size() - intersection;
        double jaccard = (union == 0) ? 1.0 : (double) intersection / union;
        answer = (int) (jaccard * 65536);
        return answer;
    }
}