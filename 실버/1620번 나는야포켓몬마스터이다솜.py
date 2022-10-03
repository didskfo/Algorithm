from curses.ascii import isdigit
import sys 
input = sys.stdin.readline 

n, m = map(int, input().split())
dict = {}
for i in range(1, n+1):
    a = input().rstrip()
    dict[i] = a
    dict[a] = i 

for _ in range(m):
    a = input().rstrip()
    if a.isdigit():
        print(dict[int(a)])
    else:
        print(dict[a])