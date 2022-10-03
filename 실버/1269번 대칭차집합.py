import sys

m, n = map(int, input().split())
a = set(map(int, sys.stdin.readline().split()))
b = set(map(int, sys.stdin.readline().split()))
c = a - b 
d = b - a
print(len(c)+len(d))