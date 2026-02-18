class Solution {
    public int solution(String arr[]) {
        int[] nums = new int[arr.length/2+1];
        String[] oper = new String[arr.length/2];
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) nums[i/2] = Integer.parseInt(arr[i]);
            else oper[i/2] = arr[i];
        }
        
        int len = nums.length;
        int[][] max = new int[len][len];
        int[][] min = new int[len][len];
        for (int i = 0; i < len; i++) {
            max[i][i] = nums[i];
            min[i][i] = nums[i];
        }
        for (int l = 2; l <= len; l++) {
            for (int i = 0; i+l-1 < len; i++) {
                int j = i+l-1;
                max[i][j] = Integer.MIN_VALUE;
                min[i][j] = Integer.MAX_VALUE;
                for (int k = i; k < j; k++) {
                    if (oper[k].equals("+")) {
                        max[i][j] = Math.max(max[i][k] + max[k+1][j], max[i][j]);
                        min[i][j] = Math.min(min[i][k] + min[k+1][j], min[i][j]);
                    } else {
                        max[i][j] = Math.max(max[i][k] - min[k+1][j], max[i][j]);
                        min[i][j] = Math.min(min[i][k] - max[k+1][j], min[i][j]);
                    }
                }
            }
        }
        return max[0][len-1];
    }
}