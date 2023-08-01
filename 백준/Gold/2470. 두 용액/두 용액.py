import sys 
input = sys.stdin.readline

n = int(input())
lst = list(map(int, input().split()))

lst.sort()
p1, p2 = 0, n-1
res = abs(lst[p1]+lst[p2])
ans = [lst[p1], lst[p2]]

while p1 < p2:
    newRes = lst[p1]+lst[p2]
    if res > abs(newRes):
        ans = [lst[p1], lst[p2]]
        res = abs(newRes)
        if newRes == 0:
            break 
    if newRes < 0:
        p1 += 1
    else:
        p2 -= 1
        
print(*ans)