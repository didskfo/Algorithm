import sys 
input = sys.stdin.readline 

n = int(input())
res = set()
for _ in range(n):
    lst = input().rstrip().split()
    if len(lst) == 1:
        if lst[0] == "all":
            res = set([i for i in range(1, 21)])
        else:
            res = set()
        continue

    if lst[0] == "add":
        res.add(int(lst[1]))
    elif lst[0] == "remove":
        res.discard(int(lst[1]))
    elif lst[0] == "check":
        if int(lst[1]) in res:
            print(1)
        else:
            print(0)
    elif lst[0] == "toggle":
        if int(lst[1]) in res:
            res.remove(int(lst[1]))
        else:
            res.add(int(lst[1]))