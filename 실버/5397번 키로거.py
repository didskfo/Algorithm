import sys
input = sys.stdin.readline 

n = int(input())
for i in range(n):
    lst = list(input().rstrip())
    l = []
    r = []
    for j in lst:
        if j == "<":
            if len(l) > 0:
                r.append(l.pop())
        elif j == ">":
            if len(r) > 0:
                l.append(r.pop(0))
        elif j == "-":
            if len(l) > 0:
                l.pop()
        else:
            l.append(j)
    print("".join(l)+"".join(reversed(r)))
