graph = [list(map(str, input().split())) for _ in range(5)]
res = []

def dfs(x, y, num):
    if len(num) == 6: # 길이가 6일 때
        if num not in res: # 중복되지 않는 수
            res.append(num)
        return # 함수 끝내기
    
    dx = [1, -1, 0, 0] # 4방향 탐색
    dy = [0, 0, 1, -1]

    for i in range(4):
        x_ = x + dx[i]
        y_ = y + dy[i]

        if 0 <= x_ < 5 and 0 <= y_ < 5: # 범위 안
            dfs(x_, y_, num + graph[x_][y_]) # 재귀 (원래 숫자에 한 숫자 더함)

for i in range(5): # 모든 좌표 탐색하기 위해 
    for j in range(5):
        dfs(i, j, graph[i][j])

print(len(res)) # 개수