import sys
input = sys.stdin.readline

n, k = map(int, input().split())
lst = []
cnt = []
a = -1
for i in range(n):
    lst.append(int(input()))
# print(lst)
# print(lst[a])
for i in range(n):
    m = k//lst[a]
    cnt.append(m)
    k = k - (lst[a]*m)
    a -= 1
    if k == 0:
        break 
print(sum(cnt))