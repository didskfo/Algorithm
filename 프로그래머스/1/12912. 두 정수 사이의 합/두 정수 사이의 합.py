def solution(a, b):
    num = [a, b]
    num.sort()
    answer = 0
    for i in range(num[0], num[1]+1):
        answer += i
    return answer