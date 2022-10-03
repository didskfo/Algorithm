import sys 
input = sys.stdin.readline 

t = int(input())
for _ in range(t):
    n = int(input())
    lst = []
    cnt = 1
    for i in range(n):
        lst.append(list(map(int, input().split())))
    lst.sort()
    com = lst[0][1]
    for i in range(1, n):
        if com > lst[i][1]:
            cnt += 1 
            com = lst[i][1]
    print(cnt)