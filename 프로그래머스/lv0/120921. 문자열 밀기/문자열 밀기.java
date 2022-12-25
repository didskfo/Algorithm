class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        String origin = A;
        while (!A.equals(B)) {
            answer++;
            String n = "";
            char[] a = A.toCharArray();
            n += a[a.length-1];
            for (int i = 0; i < a.length-1; i++) {
                n += a[i];
            }
            A = n;
            if (A.equals(origin)) {
                answer = -1;
                break;
            }
        }
        return answer;
    }
}