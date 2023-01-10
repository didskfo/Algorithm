import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        String[] dic_sort = new String[dic.length];
        Arrays.sort(spell);
        String word = Arrays.toString(spell);
        for (int i = 0; i < dic.length; i++) {
            char[] arr = dic[i].toCharArray();
            Arrays.sort(arr);
            dic_sort[i] = Arrays.toString(arr);
        }
        for (int i = 0; i < dic_sort.length; i++) {
            if (word.equals(dic_sort[i])) {
                return 1;
            }
        }
        return 2;
    }
}