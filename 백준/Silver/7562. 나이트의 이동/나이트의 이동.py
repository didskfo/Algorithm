from collections import deque

t = int(input())

dx = [-2, -2, -1, -1, 1, 1, 2, 2]
dy = [-1, 1, -2, 2, -2, 2, -1, 1]

def bfs(sx, sy):
    queue = deque()
    queue.append((sx, sy))
    
    while queue:
        x, y = queue.popleft()
        if x == ex and y == ey:
            return graph[x][y] - 1
        for i in range(8):
            nx = x + dx[i]
            ny = y + dy[i]
            
            if 0<=nx<I and 0<=ny<I and graph[nx][ny] == 0:
                graph[nx][ny] = graph[x][y] + 1
                queue.append((nx, ny))

for _ in range(t):
    I = int(input())
    sx, sy = map(int, input().split())
    ex, ey = map(int, input().split())
    graph = [[0]*I for i in range(I)]
    graph[sx][sy] = 1
    print(bfs(sx, sy))