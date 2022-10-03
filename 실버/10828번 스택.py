import sys
input = sys.stdin.readline 

n = int(input())
stk = []
for i in range(n):
    lst = list(input().split())
    if lst[0] == "push":
        stk.append(lst[1])
    elif lst[0] == "pop":
        if len(stk) > 0:
            print(stk[-1])
            del stk[-1]
        else:
            print(-1)
    elif lst[0] == "size":
        print(len(stk))
    elif lst[0] == "empty":
        if len(stk) == 0:
            print(1)
        else:
            print(0)
    elif lst[0] == "top":
        if len(stk) == 0:
            print(-1)
        else:
            print(stk[-1])