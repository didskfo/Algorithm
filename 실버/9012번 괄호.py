import sys
input = sys.stdin.readline 

n = int(input())
for i in range(n):
    lst = input().rstrip()
    a = []
    for j in lst:
        if j == '(':
            a.append(j)
        elif j == ')':
            if len(a) > 0:
                a.pop()
            else:
                print("NO")
                break 
    else:
        if len(a) == 0:
            print("YES")
        else:
            print("NO")