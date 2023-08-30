import sys 
input = sys.stdin.readline
from collections import deque

N = int(input())
graph = [[] for _ in range(N+1)]

for _ in range(N-1):
    s, e, w = map(int, input().split())
    graph[s].append((e, w))
    graph[e].append((s, w))
    
def bfs(start):
    visited = [-1] * (N+1)
    queue = deque()
    queue.append(start)
    visited[start] = 0
    dist = [0, 0]
    
    while queue:
        p = queue.popleft()
        for e, w in graph[p]:
            if visited[e] == -1:
                visited[e] = visited[p]+w
                queue.append(e)
                if dist[0] < visited[e]:
                    dist = visited[e], e
                    
    return dist

dis, node = bfs(1)
dis, node = bfs(node)

print(dis)