import java.util.*;

class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] arr = letter.split(" ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < morse.length; j++) {
                if (arr[i].equals(morse[j])) {
                    int a = j + 97;
                    char al = (char)a;
                    answer += al;
                    break;
                }
            }
        }
        return answer;
    }
}