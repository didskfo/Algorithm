# from collections import defaultdict
# def solution(clothes):
#     answer = 1
#     dic = defaultdict(list)
#     for i, j in clothes:
#         dic[j].append(i)
#     for i in dic:
#         answer *= len(dic[i])+1
#     return answer-1

from collections import defaultdict
def solution(clothes):
    answer = 1
    dic = defaultdict(int)
    for i, j in clothes:
        dic[j] += 1
    for i in dic:
        answer *= dic[i]+1
    return answer-1