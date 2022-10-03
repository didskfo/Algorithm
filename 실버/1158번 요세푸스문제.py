from collections import deque
import sys 
input = sys.stdin.readline 

n, k = map(int, input().split())
que = deque()
ans = []
for i in range(1, n+1):
    que.append(str(i))
while que:
    for i in range(k-1):
        que.append(que.popleft())
    ans.append(que.popleft())
print("<", ", ".join(ans), ">", sep="")