import sys 
input = sys.stdin.readline

n, m = map(int, input().split())
lst = [list(map(int, input().split())) for i in range(n)]
dp = [[0 for i in range(n+1)] for i in range(n+1)]

for i in range(n):
    for j in range(n):
        dp[i+1][j+1] = (dp[i][j+1] + dp[i+1][j] - dp[i][j]) + lst[i][j]

for i in range(m):
    x1, y1, x2, y2 = map(int, input().split())
    print(dp[x2][y2] - (dp[x1-1][y2] + dp[x2][y1-1] - dp[x1-1][y1-1]))








# 시간초과
# import sys 
# input = sys.stdin.readline

# n, m = map(int, input().split())
# lst = [list(map(int, input().split())) for i in range(n)]
# search = [list(map(int, input().split())) for i in range(m)]

# for _ in range(m):
#     res = 0
#     a, b, c, d = search[_][0]-1, search[_][1]-1, search[_][2]-1, search[_][3]-1
#     for i in range(a, c+1):
#         for j in range(b, d+1):
#             res += lst[i][j]
#     print(res)