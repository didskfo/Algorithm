import java.util.*;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        String number = "";
        int[] score = {0, 0, 0};
        int cnt = 0;
        char[] arr = dartResult.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (Character.isDigit(arr[i])) {
                number += arr[i];
                if (Character.isDigit(arr[i+1])) {
                    number += arr[i+1];
                    i++;
                }
            }
            if (arr[i] == 'S') {
                // ans += Integer.parseInt(number);
                score[cnt++] = Integer.parseInt(number);
                if (i+1 < arr.length) {
                    if (arr[i+1] == '*') {
                        score[cnt-1] = score[cnt-1]*2;
                        if (cnt-2 >= 0) {
                            score[cnt-2] = score[cnt-2]*2;
                        }
                    } else if (arr[i+1] == '#') {
                        score[cnt-1] = score[cnt-1]*(-1);
                    }
                }
                number = "";
            } else if (arr[i] == 'D') {
                // ans += Integer.parseInt(number) * 2;
                score[cnt++] = (int)Math.pow(Integer.parseInt(number),2);
                if (i+1 < arr.length) {
                    if (arr[i+1] == '*') {
                        score[cnt-1] = score[cnt-1]*2;
                        if (cnt-2 >= 0) {
                            score[cnt-2] = score[cnt-2]*2;
                        }
                    } else if (arr[i+1] == '#') {
                        score[cnt-1] = score[cnt-1]*(-1);
                    }
                }
                number = "";
            } else if (arr[i] == 'T') {
                // ans += Integer.parseInt(number) * 3;
                score[cnt++] = (int)Math.pow(Integer.parseInt(number),3);
                if (i+1 < arr.length) {
                    if (arr[i+1] == '*') {
                        score[cnt-1] = score[cnt-1]*2;
                        if (cnt-2 >= 0) {
                            score[cnt-2] = score[cnt-2]*2;
                        }
                    } else if (arr[i+1] == '#') {
                        score[cnt-1] = score[cnt-1]*(-1);
                    }
                }
                number = "";
            } 
        }
        for (int i : score) {
            answer += i;
        }
        return answer;
    }
}