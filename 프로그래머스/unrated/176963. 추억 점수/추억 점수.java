class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        int sum;
        for (int i = 0; i < photo.length; i++) {
            sum = 0;
            for (int j = 0; j < name.length; j++) {
                for (int k = 0; k < photo[i].length; k++) {
                    if (photo[i][k].equals(name[j])) {
                        sum += yearning[j];
                    }
                }
            }
            answer[i] = sum;
        }
        return answer;
    }
}