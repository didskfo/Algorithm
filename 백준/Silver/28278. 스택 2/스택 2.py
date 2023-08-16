import sys 
input = sys.stdin.readline

n = int(input())
stack = []
for _ in range(n):
    lst = list(map(int, input().split()))
    if len(lst) == 2:
        stack.append(lst[1])
    else:
        if lst[0] == 2:
            if len(stack) == 0:
                print(-1)
            else:
                print(stack.pop())
        elif lst[0] == 3:
            print(len(stack))
        elif lst[0] == 4:
            print(1 if len(stack) == 0 else 0)
        else:
            print(stack[-1] if len(stack) != 0 else -1)