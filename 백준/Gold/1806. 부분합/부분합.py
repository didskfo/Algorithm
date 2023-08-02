import sys 
input = sys.stdin.readline

N, S = map(int, input().split())
lst = list(map(int, input().split()))

p1, p2 = 0, 0
ans = 100001
sum = lst[0]
while True:
    if sum >= S:
        sum -= lst[p1]
        ans = min(ans, p2-p1+1)
        p1 += 1
    else:
        p2 += 1
        if p2 == N:
            break
        sum += lst[p2]

print(0) if ans == 100001 else print(ans)