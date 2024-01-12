# def solution(n, lost, reserve):
#     answer = 0
#     st = [1 for i in range(n)]
#     for i in lost:
#         st[i-1] -= 1
#     for i in reserve:
#         st[i-1] += 1
#     if st[0] == 0:
#         if st[1] > 1:
#             st[1] -= 1
#             st[0] += 1
#     if st[n-1] == 0:
#         if st[n-2] > 1:
#             st[n-2] -=1
#             st[n-1] += 1
#     for i in range(1, n-1):
#         if st[i] == 0:
#             if st[i-1] > 1:
#                 st[i-1] -= 1
#                 st[i] += 1
#             elif st[i+1] > 1:
#                 st[i+1] -= 1
#                 st[i] += 1
#     for i in st:
#         if i > 0:
#             answer += 1
#     return answer

def solution(n, lost, reserve):
    answer = 0
    lost = sorted(lost)
    for i in range(1, n+1):
        if i not in lost: 
            answer += 1
        else:
            if i in reserve: 
                answer += 1
                reserve.remove(i)
                lost.remove(i)

    for i in lost:
        if i-1 in reserve:
            answer += 1
            reserve.remove(i-1)

        elif i+1 in reserve:
            answer +=1
            reserve.remove(i+1)

    return answer