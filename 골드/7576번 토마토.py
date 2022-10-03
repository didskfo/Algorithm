from collections import deque

m, n = map(int, input().split())
lst = [list(map(int, input().split())) for i in range(n)]
que = deque()
dx = [1, 0, -1, 0]
dy = [0, 1, 0, -1]
cnt = 0
error = 0

for i in range(n):
    for j in range(m):
        if lst[i][j] == 1:
            que.append([i, j])

while que:
    x, y = que.popleft()
    for i in range(4):
        x_ = dx[i] + x 
        y_ = dy[i] + y 
        if 0 <= x_ < n and 0 <= y_ < m and lst[x_][y_] == 0:
            lst[x_][y_] = lst[x][y] + 1 
            que.append([x_, y_])


for i in lst:
    for j in i:
        if j == 0:
            error += 1 
    cnt = max(cnt, max(i))

if error == 0:
    print(cnt-1)
else:
    print(-1)