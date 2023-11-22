import itertools

def solution(numbers):
    answer = []
    idx = [i for i in range(len(numbers))]
    npr = itertools.permutations((idx), 2)
    for i, j in list(npr):
        answer.append(numbers[i]+numbers[j])
    answer = list(set(answer))
    answer.sort()
    return answer