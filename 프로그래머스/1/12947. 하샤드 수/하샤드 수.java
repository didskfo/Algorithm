class Solution {
    public boolean solution(int x) {
        int num = 0;
        String[] arr = Integer.toString(x).split("");
        for (String a : arr) {
            num += Integer.parseInt(a);
        }
        
        return x % num == 0 ? true : false;
    }
}