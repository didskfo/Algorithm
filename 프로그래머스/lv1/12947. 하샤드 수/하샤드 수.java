class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String num = Integer.toString(x);
        int hap = 0;
        for (int i = 0; i < num.length(); i++){
            hap += Integer.parseInt(num.substring(i, i+1));
        }
        if(x % hap == 0){
            return true;
        }else return false;
    }
}