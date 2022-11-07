import sys 
input = sys.stdin.readline 

n = int(input())
lst = []
for _ in range(n):
    a, b = map(int, input().split())
    lst.append([a, b])

for i in range(n):
    cnt = 1
    for j in range(n):
        if lst[i][0] < lst[j][0] and lst[i][1] < lst[j][1]:
            cnt += 1
    print(cnt, end=" ")