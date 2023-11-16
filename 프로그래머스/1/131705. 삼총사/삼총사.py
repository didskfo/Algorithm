import itertools 

def solution(number):
    answer = 0
    lst = list(itertools.combinations(number, 3))
    for a, b, c in lst:
        if a+b+c == 0:
            answer += 1
    return answer