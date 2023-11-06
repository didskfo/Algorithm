def solution(answers):
    answer = []
    p1 = [1, 2, 3, 4, 5]
    p2 = [2, 1, 2, 3, 2, 4, 2, 5]
    p3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    s1 = s2 = s3 = 0
    for i in range(len(answers)):
        if answers[i] == p1[i%len(p1)]:
            s1 += 1
        if answers[i] == p2[i%len(p2)]:
            s2 += 1
        if answers[i] == p3[i%len(p3)]:
            s3 += 1
    score = [s1, s2, s3]
    for i in range(3):
        if score[i] == max(score):
            answer.append(i+1)
    return answer