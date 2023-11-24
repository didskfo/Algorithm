def solution(board, h, w):
    answer = 0
    dx = [-1,0,0,1]
    dy = [0,-1,1,0]
    for i in range(4):
        nx = w+dx[i]
        ny = h+dy[i]
        if 0<=nx<len(board[0]) and 0<=ny<len(board):
            if board[ny][nx] == board[h][w]:
                answer+=1
    return answer