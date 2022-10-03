from collections import deque
import sys 
input = sys.stdin.readline 

que = deque()
for _ in range(int(input())):
    lst = input().split()
    if lst[0] == "push_front":
        que.appendleft(lst[1])
    elif lst[0] == "push_back":
        que.append(lst[1])
    elif lst[0] == "pop_front":
        if que:
            print(que.popleft())
        else:
            print(-1)
    elif lst[0] == "pop_back":
        if que:
            print(que.pop())
        else:
            print(-1)
    elif lst[0] == "size":
        print(len(que))
    elif lst[0] == "empty":
        if que:
            print(0)
        else:
            print(1)
    elif lst[0] == "front":
        if que:
            a = que.popleft()
            print(a)
            que.appendleft(a)
        else:
            print(-1)
    elif lst[0] == "back":
        if que:
            a = que.pop()
            print(a)
            que.append(a)
        else:
            print(-1)