# def solution(arr):
#     answer = []
#     for i in arr:
#         if i not in answer:
#             answer.append(i)
#         elif answer[-1] != i:
#             answer.append(i)
#     return answer

def solution(arr):
    answer = []
    for i in arr:
        if answer[-1:] != [i]:
            answer.append(i)
    return answer