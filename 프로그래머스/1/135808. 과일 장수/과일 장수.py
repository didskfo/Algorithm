def solution(k, m, score):
    answer = 0
    score.sort(reverse=True)
    box = 0
    for i in range(len(score)):
        box += 1
        if box == m:
            answer += m*score[i]
            box = 0
    return answer