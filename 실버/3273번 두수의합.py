import sys 
input = sys.stdin.readline 

n = int(input())
lst = list(map(int, input().split()))
lst.sort()
m = int(input())

l, r = 0, n-1
cnt = 0
while l < r:
    hap = lst[l] + lst[r]
    if hap == m:
        cnt += 1 
        l += 1 
    elif hap < m:
        l += 1 
    else:
        r -= 1 
print(cnt)