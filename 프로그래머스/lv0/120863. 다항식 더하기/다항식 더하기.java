import java.util.*;

class Solution {
    public String solution(String polynomial) {
        String[] arr = polynomial.split(" ");
        int num = 0;
        int x_num = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("x")) {
                x_num += arr[i].equals("x") ? 1 : Integer.parseInt(arr[i].replaceAll("x", ""));
            } else if (!arr[i].equals("+")) {
                num += Integer.parseInt(arr[i]);
            }
        }
        String answer = "";
        if (x_num == 0) {
            answer = Integer.toString(num);
        } else if (num == 0) {
            if (x_num == 1) {
                answer = "x";
            } else {
                answer = Integer.toString(x_num) + "x";
            }
        } else {
            if (x_num == 1) {
                answer = "x + " + Integer.toString(num);
            } else {
                answer = Integer.toString(x_num) + "x + " + Integer.toString(num);
            }
        }
        return answer;
    }
}