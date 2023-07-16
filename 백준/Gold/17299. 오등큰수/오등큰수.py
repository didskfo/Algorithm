import sys 
from collections import Counter
input = sys.stdin.readline

n = int(input())
lst = list(map(int, input().split()))
cnt = Counter(lst)
stack = []
ans = [-1]*n

for i in range(n):
    while stack and cnt[lst[stack[-1]]] < cnt[lst[i]]:
        ans[stack.pop()] = lst[i]
    stack.append(i)
    
print(*ans)