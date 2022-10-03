import sys

m, n = map(int, input().split())
a = set(map(int, sys.stdin.readline().split()))
b = set(map(int, sys.stdin.readline().split()))
ans = sorted(a-b)
if len(ans) == 0:
    print(0)
else:
    print(len(ans))
    for i in ans:
        print(i, end=" ")