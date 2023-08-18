import sys 
input = sys.stdin.readline
from collections import deque

n = int(input())
queue = deque()
for _ in range(n):
    lst = list(map(int, input().split()))
    if len(lst) == 2:
        if lst[0] == 1:
            queue.appendleft(lst[1])
        else:
            queue.append(lst[1])
    else:
        if lst[0] == 3:
            print(queue.popleft() if len(queue) != 0 else -1)
        elif lst[0] == 4:
            print(queue.pop() if len(queue) != 0 else -1)
        elif lst[0] == 5:
            print(len(queue))
        elif lst[0] == 6:
            print(1 if len(queue) == 0 else 0)
        elif lst[0] == 7:
            print(queue[0] if len(queue) != 0 else -1)
        else:
            print(queue[-1] if len(queue) != 0 else -1)