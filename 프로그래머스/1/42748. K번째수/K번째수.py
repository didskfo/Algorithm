def solution(array, commands):
    answer = []
    for t in range(len(commands)):
        lst = []
        for i in range(commands[t][0]-1, commands[t][1]):
            lst.append(array[i])
        lst.sort()
        answer.append(lst[commands[t][2]-1])    
    return answer