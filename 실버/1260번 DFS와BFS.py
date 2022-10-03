from collections import deque
import sys 
input = sys.stdin.readline

n, m, v = map(int, input().split())
grh = [[] for _ in range(n+1)]
visit_d = [False for _ in range(n+1)]
visit_b = [False for _ in range(n+1)]

for _ in range(m):
    a, b = map(int, input().split())
    grh[a].append(b)
    grh[b].append(a)

for i in range(len(grh)):
    grh[i].sort()

def dfs(grh, start, visit):
    visit[start] = True 
    print(start, end=" ")
    for i in grh[start]:
        if not visit[i]:
            dfs(grh, i, visit)

def bfs(grh, start, visit):
    visit[start] = True
    que = deque([start])
    while que:
        v = que.popleft()
        print(v, end=" ")
        for i in grh[v]:
            if not visit[i]:
                que.append(i)
                visit[i] = True

dfs(grh, v, visit_d)
print()
bfs(grh, v, visit_b)
