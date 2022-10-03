import sys
input = sys.stdin.readline 

def is_pn(n):
    for i in range(2, n):
        if i * i > n:
            break 
        if n % i == 0:
            return False 
    return True 

n = int(input())
lst = set(map(int, input().split()))

ans = 1 
for n in lst:
    if is_pn(n):
        ans *= n 

if ans == 1:
    print(-1)
else:
    print(ans)