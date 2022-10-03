import sys

n = int(input())
lst = sorted(list(map(int, sys.stdin.readline().split())))
if n%2 == 0:
    print(lst[n//2-1])
else:
    print(lst[n//2])