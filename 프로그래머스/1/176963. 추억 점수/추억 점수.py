def solution(name, yearning, photo):
    answer = []
    for i in range(len(photo)):
        lst = photo[i]
        res = 0
        for j in lst:
            if j in name:
                res += yearning[name.index(j)]
        answer.append(res)
    return answer