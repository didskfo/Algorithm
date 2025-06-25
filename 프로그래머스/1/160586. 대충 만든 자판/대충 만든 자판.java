class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        int idx = 0;
        for (String target : targets) {
            int cnt = 0;
            for (int i = 0; i < target.length(); i++) {
                char t = target.charAt(i);
                int a = 101;
                boolean check = false;
                for (String key : keymap) {
                    int c = count(key, t);
                    if (c != -1) {
                        a = Math.min(a, c);
                        check = true;
                    }
                }
                if (check) cnt += a;
                else {
                    cnt = -1;
                    break;
                }
            }
            answer[idx++] = cnt;
        }
        return answer;
    }
    
    static int count(String key, char find) {
        for (int i = 0; i < key.length(); i++) {
            if (key.charAt(i) == find) return i+1;
        }
        return -1;
    }
}