import sys
input = sys.stdin.readline 

n = int(input())
lst = []

for _ in range(n):
    n, d, m, y = input().rstrip().split()
    d, m, y = map(int, (d, m, y))
    lst.append((y, m, d, n))
lst.sort()

print(lst[-1][3])
print(lst[0][3])