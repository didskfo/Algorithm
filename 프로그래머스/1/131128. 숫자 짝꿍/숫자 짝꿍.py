from collections import Counter

def solution(X, Y):
    answer = ''
    X = Counter(X)
    Y = Counter(Y)
    num = X-(X-Y)
    lst = []
    if len(num) == 0:
        answer = "-1"
    else:
        for i in num:
            for j in range(num[i]):
                lst.append(i)
        lst.sort(reverse=True)
        for i in lst:
            answer += i
        if answer[0] == "0":
            answer = "0"
    return answer