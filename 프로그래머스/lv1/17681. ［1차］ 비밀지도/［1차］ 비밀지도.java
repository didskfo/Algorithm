import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        char[][] arr1_b = new char[n][];
        char[][] arr2_b = new char[n][];
        for (int i = 0; i < n; i++) {
            String bin_1 = Integer.toBinaryString(arr1[i]);
            while (bin_1.length() < n) {
                bin_1 = "0" + bin_1;
            }
            arr1_b[i] = bin_1.toCharArray();
            String bin_2 = Integer.toBinaryString(arr2[i]);
            while (bin_2.length() < n) {
                bin_2 = "0" + bin_2;
            }
            arr2_b[i] = bin_2.toCharArray();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr1_b[i][j] == '1' || arr2_b[i][j] == '1') {
                    answer[i] += '#';
                } else {
                    answer[i] += " ";
                }
            }
        }
        for (int i = 0; i < n; i++) {
            answer[i] = answer[i].substring(4);
        }
        return answer;
    }
}