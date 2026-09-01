import java.util.*;

class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ");
        ArrayList<Integer> numbers = new ArrayList<>();
        for (String str : arr) {
            numbers.add(Integer.parseInt(str));
        }
        
        Collections.sort(numbers);
        return Integer.toString(numbers.get(0)) + " " + Integer.toString(numbers.get(numbers.size()-1));
    }
}