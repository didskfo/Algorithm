import sys
n = int(input())
lst = []
for i in range(n):
    lst.append(sys.stdin.readline().split())

ans = sorted(lst, key = lambda x : (-int(x[1]), int(x[2]), -int(x[3]), x[0]))

for name in ans:
    print(name[0])