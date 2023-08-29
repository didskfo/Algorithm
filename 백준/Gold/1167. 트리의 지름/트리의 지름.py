import sys 
input = sys.stdin.readline
from collections import deque

V = int(input())
graph = [[] for _ in range(V+1)]

for _ in range(V):
    arr = list(map(int, input().split()))
    for e in range(1, len(arr)-2, 2):
        graph[arr[0]].append((arr[e], arr[e+1]))
        
def bfs(start):
    visited = [-1] * (V+1)
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