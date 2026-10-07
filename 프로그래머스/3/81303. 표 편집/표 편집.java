import java.util.*;

class Solution {
    public String solution(int n, int k, String[] cmd) {
        int[] prev = new int[n];
        int[] next = new int[n];
        int prevNum = -1;
        int nextNum = 1;
        for (int i = 0; i < n; i++) {
            prev[i] = prevNum++;
            next[i] = nextNum++;
            if (i == n-1) next[i] = -1;
        }
        
        Stack<Integer> stack = new Stack<>();
        
        for (String c : cmd) {
            String[] command = c.split(" ");
            if (command[0].equals("U")) {
                int cnt = Integer.parseInt(command[1]);
                for (int i = 0; i < cnt; i++) {
                    k = prev[k];
                }
            } else if (command[0].equals("D")) {
                int cnt = Integer.parseInt(command[1]);
                for (int i = 0; i < cnt; i++) {
                    k = next[k];
                }
            } else if (command[0].equals("C")) {
                stack.push(k);
                
                if (prev[k] != -1) {
                    next[prev[k]] = next[k];
                }
                if (next[k] != -1) {
                    prev[next[k]] = prev[k];
                }
                
                if (next[k] != -1) {
                    k = next[k];
                } else {
                    k = prev[k];
                }
            } else {
                int z = stack.pop();
                if (prev[z] != -1) {
                    next[prev[z]] = z;
                }
                if (next[z] != -1) {
                    prev[next[z]] = z;
                }
            }
        }
        
        char[] answer = new char[n];
        Arrays.fill(answer, 'O');

        for (int deleted : stack) {
            answer[deleted] = 'X';
        }

        return new String(answer);
    }
}