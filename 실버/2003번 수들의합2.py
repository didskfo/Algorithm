import sys 
input = sys.stdin.readline 

n, m = map(int, input().split())
lst = list(map(int, input().split()))
l, r = 0, 1
cnt = 0
while r <= n and l <= r:
    num = lst[l:r]
    hap = sum(num)
    if hap == m:
        cnt += 1 
        r += 1 
    elif hap < m:
        r += 1 
    else:
        l += 1 
print(cnt)