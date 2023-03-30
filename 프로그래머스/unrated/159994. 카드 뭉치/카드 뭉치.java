class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        int idx_1 = 0;
        int idx_2 = 0;
        int cnt = 0;
        for (int i = 0; i < goal.length; i++) {
            if (idx_1 >= cards1.length) {
                if (goal[i].equals(cards2[idx_2])) {
                    idx_2++;
                    cnt++;
                } else {
                    break;
                }
            } 
            else if (idx_2 >= cards2.length) {
                if (goal[i].equals(cards1[idx_1])) {
                    idx_1++;
                    cnt++;
                } else {
                    break;
                }
            }
            else {
                if (goal[i].equals(cards1[idx_1])) {
                    idx_1++;
                    cnt++;
                } else if (goal[i].equals(cards2[idx_2])) {
                    idx_2++;
                    cnt++;
                } else {
                    break;
                }
            }
        }
        if (cnt == goal.length) {
            answer = "Yes";
        } else {
            answer = "No";
        }
        return answer;
    }
}