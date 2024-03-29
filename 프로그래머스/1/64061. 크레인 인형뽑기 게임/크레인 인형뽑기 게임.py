def solution(board, moves):
    answer = 0
    box = []
    for i in moves:
        for j in board:
            if j[i-1] != 0:
                box.append(j[i-1])
                j[i-1] = 0
                break
        while len(box) > 1 and box[-1] == box[-2]:
            if box[-1] == box[-2]:
                box = box[:-2]
                answer += 2
    
    return answer