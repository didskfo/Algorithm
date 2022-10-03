import sys 
input = sys.stdin.readline 

l = list(map(str, input().rstrip()))
r = []
n = int(input())
for i in range(n):
    lst = list(input().split())
    if lst[0] == 'L':
        if len(l) > 0:
            a = l.pop()
            r.append(a)
    elif lst[0] == 'D':
        if len(r) > 0:
            b = r.pop()
            l.append(b)
    elif lst[0] == 'B':
        if len(l) > 0:
            l.pop()
    elif lst[0] == 'P':
        l.append(lst[1])
print("".join(l)+"".join(reversed(r)))