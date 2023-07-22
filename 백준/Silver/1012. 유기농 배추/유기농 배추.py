import sys 
input = sys.stdin.readline
from collections import deque

dx = [-1, 0, 1, 0]
dy = [0, -1, 0, 1]

def bfs(graph, a, b):
    n = len(graph)
    m = len(graph[0])
    queue = deque()
    queue.append((a, b))
    graph[b][a] = 0
    
    while queue:
        x, y = queue.popleft()
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if nx < 0 or nx >= m or ny < 0 or ny >= n:
                continue
            if graph[ny][nx] == 1:
                graph[ny][nx] = 0
                queue.append((nx, ny))

t = int(input())
for q in range(t):
    m, n, k = map(int, input().split())
    graph = [[0 for j in range(m)]for i in range(n)]
    cnt = 0
    
    for i in range(k):
        x, y = map(int, input().split())
        graph[y][x] = 1
    
    for i in range(m):
        for j in range(n):
            if graph[j][i] == 1:
                bfs(graph, i, j)
                cnt += 1
    
    print(cnt)