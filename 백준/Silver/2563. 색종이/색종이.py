import sys 
input = sys.stdin.readline 

paper = [[0 for i in range(100)] for j in range(100)]
n = int(input())
for _ in range(n):
    x, y = map(int, input().split())
    for i in range(100-y-10, 100-y):
        for j in range(x, x+10):
            paper[i][j] += 1
s = 0
for i in range(100):
    for j in range(100):
        if paper[i][j] != 0:
            s += 1
print(s)