import heapq

def solution(operations):
    que = []
    for operation in operations:
        x, num = operation.split()
        if x == 'I':
            heapq.heappush(que, int(num))
        elif x == 'D' and num == '1' and que:
            max_num = max(que)
            que.remove(max_num)
        elif x == 'D' and num == '-1' and que:
            heapq.heappop(que)
    if que:
        return [max(que), que[0]]
    return [0, 0]