def solution(N, stages):
    answer = []
    dic = {}
    total = len(stages)
    for i in range(1, N+1):
        if total != 0:
            fail = stages.count(i)
            dic[i] = fail/total
            total -= fail
        else:
            dic[i] = 0
    answer = sorted(dic, key=lambda x:dic[x], reverse=True)
    return answer