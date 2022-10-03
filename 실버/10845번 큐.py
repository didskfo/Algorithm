from collections import deque 
import sys 
input = sys.stdin.readline 

n = int(input())
que = deque()
for i in range(n):
    lst = list(input().split())
    if lst[0] == "push":
        que.append(lst[1])
    elif lst[0] == "pop":
        if que:
            a = que.popleft()
            print(a)
        else:
            print(-1)
    elif lst[0] == "size":
        print(len(que))
    elif lst[0] == "empty":
        if len(que) == 0:
            print(1)
        else:
            print(0)
    elif lst[0] == "front":
        if que:
            a = que.popleft()
            print(a)
            que.appendleft(a)
        else:
            print(-1)
    else:
        if que:
            a = que.pop()
            print(a)
            que.append(a)
        else:
            print(-1)