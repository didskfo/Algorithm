import sys 
input = sys.stdin.readline 

n = int(input())
enter = {}
for i in range(n):
    a, b = map(str, input().split())
    if b == "enter":
        enter[a] = 1
    else:
        if enter[a]:
            del enter[a]

for i in sorted(enter, reverse=True):
    print(i)