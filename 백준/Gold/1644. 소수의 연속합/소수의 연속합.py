import math

N = int(input())
check = [False, False] + [True]*(N-1)
prime = []

for i in range(2, N+1):
    if check[i]:
        prime.append(i)
        for j in range(2*i, N+1, i):
            check[j] = False
            
ans = 0
p1, p2 = 0, 0

while p2 <= len(prime):
    newsum = sum(prime[p1:p2])
    if newsum == N:
        ans += 1
        p2 += 1
    elif newsum < N:
        p2 += 1
    else:
        p1 += 1
        
print(ans)