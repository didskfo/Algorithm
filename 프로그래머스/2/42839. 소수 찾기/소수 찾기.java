import java.util.*;

class Solution {
    static char[] arr;
    static Set<Integer> set = new HashSet<>();
    static boolean[] visited;
    static char[] selected;
    public int solution(String numbers) {
        int answer = 0;
        arr = numbers.toCharArray();
        visited = new boolean[arr.length];
        for (int i = 1; i <= arr.length; i++) {
            selected = new char[i];
            permutation(i, 0);
        }
        for (Integer s : set) {
            if (isPrime(s)) answer++;
        }
        return answer;
    }
    
    static void permutation(int len, int cnt) {
        if (cnt == len) {
            String num = "";
            for (int i = 0; i < len; i++) {
                num += String.valueOf(selected[i]);
            }
            set.add(Integer.parseInt(num));
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                selected[cnt] = arr[i];
                permutation(len, cnt+1);
                visited[i] = false;
            }
        }
    }
    
    static boolean isPrime(int n) {
        if (n == 0 || n == 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}