class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 1;
        while (!(Math.abs(a-b) == 1 && Math.min(a, b)%2 == 1)) {
            a = a%2==1?(a+1)/2:a/2;
            b = b%2==1?(b+1)/2:b/2;
            answer++;
        }
        return answer;
    }
}