import heapq

def solution(jobs):
    answer = 0
    time, idx = 0, 0
    before = -1
    heap = []
    
    while idx < len(jobs):
        for job in jobs:
            if before < job[0] <= time:
                heapq.heappush(heap, [job[1], job[0]])
        if heap:
            cur = heapq.heappop(heap)
            before = time
            time += cur[0]
            answer += (time-cur[1])
            idx += 1
        else:
            time += 1
    return int(answer/len(jobs))