from collections import deque
import sys 
input = sys.stdin.readline

n, m, r = map(int, input().split())
graph = [[] for i in range(n+1)]
visit = [False for i in range(n+1)]
cnt = [0 for i in range(n+1)]
num = 1
queue = deque()
queue.append(r)

for i in range(m):
    s, e = map(int, input().split())
    graph[s].append(e)
    graph[e].append(s)
    
for i in graph:
    i.sort(reverse=True)
    
while queue:
    v = queue.popleft()
    if visit[v]:
        continue
    cnt[v] = num
    num += 1
    visit[v] = True
    for i in graph[v]:
        if visit[i] == False:
            queue.append(i)

print(*cnt[1:], sep='\n')