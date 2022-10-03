import sys 
input = sys.stdin.readline 

n = int(input())
lst = list(map(int, input().split()))
dp = [0 for _ in range(n)]
dp[0] = lst[0]
for i in range(1, n):
    res = []
    for j in range(i-1, -1, -1):
        if lst[i] > lst[j]:
            res.append(dp[j])
    if not res:
        dp[i] = lst[i]
    else:
        dp[i] = lst[i] + max(res)
print(max(dp))