class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;
        String[] array = s.toLowerCase().split("");
        for(int i = 0; i < array.length; i++){
            if("p".equals(array[i])){
                p ++;
            }else if("y".equals(array[i])){
                y++;
            }
        }
        if(p == y){
            return true;
        }else return false;
        

        
    }
}