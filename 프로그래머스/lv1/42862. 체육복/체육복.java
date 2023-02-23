class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] stu = new int[n];
        for (int i = 0; i < n; i++) {
            stu[i] = 1;
        }
        for (int i : lost) {
            stu[i-1]--;
        }
        for (int i : reserve) {
            stu[i-1]++;
        }
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                if (stu[i] == 0) {
                    if (stu[i+1] == 2) {
                        stu[i]++;
                        stu[i+1]--;
                    }
                }
            }
             else if (i != 0 && i != n-1) {
                if (stu[i] == 0) {
                    if (stu[i-1] == 2) {
                        stu[i-1]--;
                        stu[i]++;
                    } else if (stu[i+1] == 2) {
                        stu[i+1]--;
                        stu[i]++;
                    }
                }
            }
                 else if (i == n-1) {
                if (stu[i] == 0) {
                    if (stu[i-1] == 2) {
                        stu[i]++;
                        stu[i-1]--;
                    }
                }
            }
        }
        for (int i : stu) {
            if (i > 0) {
                answer++;
            }
        }
        return answer;
    }
}