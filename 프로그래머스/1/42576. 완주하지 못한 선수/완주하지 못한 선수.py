# def solution(participant, completion):
#     answer = ''
#     dic = {}
#     for i in set(participant):
#         dic[i] = 0
#     for i in participant:
#         dic[i] += 1
#     for i in completion:
#         dic[i] -= 1
#     for i in dic:
#         if dic[i] != 0:
#             answer += i
#     return answer

from collections import Counter

def solution(participant, completion):
    answer = list(Counter(participant)-Counter(completion))
    return answer[0]