import sys
input = sys.stdin.readline
import heapq

n = int(input())
que = []

for i in range(n):
    a = int(input())
    if a != 0:
        heapq.heappush(que, (abs(a), a))
    else:
        if que:
            print(heapq.heappop(que)[1])
        else:
            print(0)