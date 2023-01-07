class Solution {
    public String solution(String X, String Y) {
        StringBuffer answer = new StringBuffer(); 
        char[] x = X.toCharArray();
        char[] y = Y.toCharArray();
        
        int[] num_x = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] num_y = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] num = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i < x.length; i++) {
            num_x[Character.getNumericValue(x[i])]++;
        }
        for (int i = 0; i < y.length; i++) {
            num_y[Character.getNumericValue(y[i])]++;
        }
        for (int i = 0; i < num.length; i++) {
            num[i] = Math.min(num_x[i], num_y[i]);
        }
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        if (sum == 0) {
            return "-1";
        }
        for (int i = num.length-1; i >= 0; i--) {
            if (i == 0) {
                if (answer.toString().equals("")) {
                    if (num[i] > 0) {
                    answer.append(Integer.toString(i));
                    }
                } else {
                    for (int j = 0; j < num[i]; j++) {
                        answer.append(Integer.toString(i));
                    }
                }
            } else {
                for (int j = 0; j < num[i]; j++) {
                answer.append(Integer.toString(i));
                }
            }
            
        }
        
        return answer.toString();
    }
}