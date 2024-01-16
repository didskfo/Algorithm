import heapq

def solution(scoville, K):
    answer = 0
    len_scoville = len(scoville)
    heapq.heapify(scoville)
    while len(scoville)>1:
        if scoville[0] >= K:
            return answer
        one = heapq.heappop(scoville)
        two = heapq.heappop(scoville)
        heapq.heappush(scoville, one+two*2)
        answer += 1
    if scoville[0] < K:
        return -1
    return answer
    # if len_scoville == 2:
    #     if scoville[0]+scoville[1]*2 >= K:
    #         return 1
    #     return -1
    # while True:
    #     one = heapq.heappop(scoville)
    #     if one >= K:
    #         break
    #     two = heapq.heappop(scoville)
    #     heapq.heappush(scoville, one+two*2)
    #     answer += 1
    #     if answer >= len_scoville-1:
    #         return -1
    # return answer
