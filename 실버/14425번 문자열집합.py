import sys 
input = sys.stdin.readline 

n, m = map(int, input().split())
ans = []
lst = []
cnt = 0 
for _ in range(n):
    ans.append(input())
for _ in range(m):
    lst.append(input())
for i in range(m):
    if lst[i] in ans:
        cnt += 1 
print(cnt)