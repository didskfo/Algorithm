import sys 
input = sys.stdin.readline 
sys.setrecursionlimit(10000)

def dfs(x, y):
    dx = [-1, -1, -1, 0, 0, 1, 1, 1]
    dy = [-1, 0, 1, -1, 1, -1, 0, 1]

    grh[y][x] = 0
    for k in range(8):
        x_ = x + dx[k]
        y_ = y + dy[k]
        grh[y][x] = 0
        if 0 <= x_ < w and 0 <= y_ < h and grh[y_][x_] == 1:
            dfs(x_, y_)

while True:
    w, h = map(int, input().split())

    if w == 0 and h == 0:
        break
    else:
        grh = []
        cnt = 0
        for _ in range(h):
            grh.append(list(map(int, input().split())))
        for y in range(h):
            for x in range(w):
                if grh[y][x] == 1:
                    dfs(x, y)
                    cnt += 1

    print(cnt)
