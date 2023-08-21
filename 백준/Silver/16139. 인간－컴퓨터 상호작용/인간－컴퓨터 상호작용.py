import sys 
input = sys.stdin.readline

S = input().strip()
q = int(input())

dp = [[0 for i in range(26)] for _ in range(len(S))]
dp[0][ord(S[0])-97] = 1

for i in range(1, len(S)):
    dp[i][ord(S[i])-97] = 1
    for j in range(26):
        dp[i][j] += dp[i-1][j]

for _ in range(q):
    arr = input().split()
    if int(arr[1])>0:
        ans = dp[int(arr[2])][ord(arr[0]) - 97] - dp[int(arr[1]) - 1][ord(arr[0]) - 97]
    else:
        ans = dp[int(arr[2])][ord(arr[0]) - 97]
    print(ans)
    