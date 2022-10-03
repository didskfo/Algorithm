from collections import deque
import sys 
input = sys.stdin.readline 

t = int(input())
for _ in range(t):
    n = int(input())
    li = deque(input().split())
    queue = deque(li.popleft())
    while li:
        t = li.popleft()
        if t > queue[0]:
            queue.append(t)
        else:
            queue.appendleft(t)
    print(''.join(queue))