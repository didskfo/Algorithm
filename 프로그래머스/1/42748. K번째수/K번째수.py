def solution(array, commands):
    answer = []
    for i, j, k in commands:
        answer.append(sorted(array[i-1:j])[k-1])
    return answer

# return [sorted(array[a-1:b])[c-1] for a,b,c in commands]