n = int(input())
dp = [0, 1, 1]
for i in range(3, 91):
    res = dp[i-2] + dp[i-1]
    dp.append(res)

print(dp[n])