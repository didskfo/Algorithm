def solution(t, p):
    answer = 0
    lst = []
    for i in range(len(t)-len(p)+1):
        num = ""
        for j in range(len(p)):
            num += t[i+j]
        lst.append(int(num))
    for i in lst:
        if i <= int(p):
            answer += 1
    return answer