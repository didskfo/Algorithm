import sys 
input = sys.stdin.readline 

n, k = map(int, input().split())
lst = list(map(int, input().split()))
dp = []
dp.append(sum(lst[:k]))

for i in range(n-k):
    dp.append(dp[i] - lst[i] + lst[i+k])

print(max(dp))






# 시간초과
# import sys 
# input = sys.stdin.readline 

# n, k = map(int, input().split())
# lst = list(map(int, input().split()))
# dp = []

# for i in range(n-k+1):
#     res = 0
#     for j in range(i, i+k):
#         res += lst[j]
#     dp.append(res)
    
# print(max(dp))