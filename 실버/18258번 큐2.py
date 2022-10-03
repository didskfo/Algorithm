from collections import deque
import sys 
input = sys.stdin.readline 

res = deque()
for _ in range(int(input())):
    lst = list(input().split())
    if lst[0] == 'push':
        res.append(lst[1])
    elif lst[0] == 'pop':
        if res:
            print(res.popleft())
        else:
            print(-1)
    elif lst[0] == 'size':
        print(len(res))
    elif lst[0] == 'empty':
        if res:
            print(0)
        else:
            print(1)
    elif lst[0] == 'front':
        if res:
            print(res[0])
        else:
            print(-1)
    else:
        if res:
            print(res[-1])
        else:
            print(-1)