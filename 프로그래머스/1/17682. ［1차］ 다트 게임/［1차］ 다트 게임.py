def solution(dartResult):
    answer = 0
    lst = list(dartResult)
    dic = {'S':1, 'D':2, 'T':3}
    score = ""
    number = []
    for i in lst:
        if i.isdigit():
            score+=i
        elif i in dic:
            number.append(int(score)**dic[i])
            score=""
        elif i == '#':
            number[-1] *= -1
        elif i == '*':
            number[-1] *= 2
            if len(number)>1:
                number[-2] *= 2
    answer = sum(number)
    return answer